package com.codygym.controller;

import com.codygym.model.Customer;
import com.codygym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping(value = {"","/list"})
    public ModelAndView customerList(){
        return new ModelAndView("/list", "customerList", customerService.findAll());
    }

    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {

        model.addAttribute("customer", new Customer());

        return "/create";
    }
    @PostMapping(value = "/create")
    public String createStudent(@Validated @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new Customer().validate(customer, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/create";
        } else {
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("successMsg", "Create customer: " + customer.getLastName() + " success!");
            return "redirect:/list";
        }
    }
}
