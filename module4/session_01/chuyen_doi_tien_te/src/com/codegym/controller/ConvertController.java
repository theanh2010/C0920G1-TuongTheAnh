package com.codegym.controller;

import com.codegym.services.IConvertServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {

    @Autowired
    private IConvertServices convertServices;

    @GetMapping("/")
    public String getForm(){
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam String vnd, Model model){
       model.addAttribute("result",this.convertServices.convert(Double.parseDouble(vnd)));
       return "result";
    }
}
