package com.codegym.controller;

import com.codegym.entity.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping({"", "/customer"})
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping(value = {"", "/list"})
    public ModelAndView customerList() {
        return new ModelAndView("/customer/list", "customerList", customerService.findAll());
    }


    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {
        List<ClassRoom> classRooms = new ArrayList<>();
        classRooms.add(new ClassRoom(1, "C09"));
        classRooms.add(new ClassRoom(2, "C10"));
        classRooms.add(new ClassRoom(3, "C11"));

        model.addAttribute("classRooms", classRooms);
        model.addAttribute("student", new Student());

        return "/student/create";
    }

    @PostMapping(value = "/create")
    public String createStudent(@Validated @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new Customer().validate(customer, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/customer/create";
        } else {
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("successMsg", "Create customer: " + customer.getNameCustomer() + " success!");
            return "redirect:/customer";
//        return "forward:/student";
        }
    }

    //
    @GetMapping(value = "/edit/{id}")
    public String showEditPage(@PathVariable int id, Model model) {
        model.addAttribute("student", customerService.f(id));
        return "/customer/edit";
    }

    @PostMapping(value = "/edit")
    public String editStudent(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerService.update(customer);
        redirectAttributes.addFlashAttribute("successMsg", "Update student: " + customer.getNameCustomer() + " success!");
        return "redirect:/student";
    }

    @GetMapping("/search")
    public ModelAndView searchByText(@RequestParam String inputSearch) {
        return new ModelAndView("/customer/list", "studentList", customerService.findAll(inputSearch, pageable));
    }
}
