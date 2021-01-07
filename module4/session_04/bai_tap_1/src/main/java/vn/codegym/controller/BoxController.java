package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.BoxLetter;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BoxController {

    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {
        model.addAttribute("boxLetter", new BoxLetter());

        List<String> languageList = new ArrayList<>();
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
        model.addAttribute("languageList", languageList);

        List<String > pageSizeList = new ArrayList<>();
        pageSizeList.add("5");
        pageSizeList.add("10");
        pageSizeList.add("15");
        pageSizeList.add("25");
        pageSizeList.add("50");
        pageSizeList.add("100");
        model.addAttribute("pageSizeList", pageSizeList);


        return "/create";
    }


}
