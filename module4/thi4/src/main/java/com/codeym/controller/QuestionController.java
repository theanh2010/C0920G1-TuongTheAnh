package com.codeym.controller;

import com.codeym.entity.Question;
import com.codeym.service.QuestionService;
import com.codeym.service.QuestionTypeService;
import com.codeym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping({"/", "home"})
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionTypeService questionTypeService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String goLishQuestion(Model model,
                                 @PageableDefault Pageable pageable,
                                 @RequestParam(defaultValue = "") String questionType,
                                 @RequestParam(defaultValue = "") String user) {



        if (!questionType.equals("") && user.equals("")) {
            model.addAttribute("questionList", questionService.findAllByQuestionType(questionType));
        } else {
            model.addAttribute("questionList", questionService.findAll(pageable));
        }

        return "view/question/list";
    }

    @GetMapping("/create-question")
    public String goCreateQuestion(Model model) {
        model.addAttribute("question", new Question());
        model.addAttribute("questionTypeList", questionTypeService.findAll());
        model.addAttribute("userList",userService.findAll());

        return "view/question/create";
    }

    @PostMapping("/create-question")
    public String createQuestion(@Valid @ModelAttribute Question question,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes,
                                 Model model) {
//        giaoDichValidator.validate(giaoDich, bindingResult);

        if (bindingResult.hasErrors()) {
            model.addAttribute("questiontypeList", questionTypeService.findAll());
            return "view/question/create";
        }

        questionService.save(question);

        redirectAttributes.addFlashAttribute("success", "Them moi thanh cong");
        return "redirect:/home";
    }

    @GetMapping("/detail/{id}")
    public String goDetail(Model model, @PathVariable Integer id) {
        model.addAttribute("question", questionService.findById(id));

        return "view/question/detail";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable Integer id, RedirectAttributes redirectAttributes) {

        questionService.deleteById(id);

        redirectAttributes.addFlashAttribute("success", "Xoa thanh cong");

        return "redirect:/home";
    }



}
