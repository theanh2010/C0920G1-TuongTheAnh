package com.codegym.controller;


import com.codegym.entity.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes("user")
@RequestMapping({"/","/home"})
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public String goHome(Model model) {
        if (LoginController.getCookieUsername() != null) {
            model.addAttribute("user",userService.findByName(LoginController.getCookieUsername().getValue()));
        }
        return "view/home";
    }
}
