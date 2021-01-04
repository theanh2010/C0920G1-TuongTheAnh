package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @RequestMapping(value = "/create" , method = RequestMethod.GET)
    public String showCreateForm() {
        return "/create";
    }
    @RequestMapping(value = "/create" , method = RequestMethod.POST)
    public String showForm(@RequestParam String eng , Model model){
        String vn ;
        switch (eng){
            case "hello" :
                vn = "xin chao";
                break;
            case "book" :
                vn = "quyen vo";
                break;
            default:
                vn = "not found";
                break;


        }
        model.addAttribute("vn",vn);
//        Map<String, String> dic = new HashMap<>();
//        dic.put("hello", "Xin chào");
//        dic.put("how", "Thế nào");
//        dic.put("book", "Quyển vở");
//        dic.put("computer", "Máy tính");
//        String search = request.getParameter("search");
//
//        String result = dic.get(search);
//        if (result != null) {
//            out.println("Word: " + search);
//            out.println("Result: " + result);
//        } else {
//            out.println("Not found");
//        }
        return "/create";
    }
}
