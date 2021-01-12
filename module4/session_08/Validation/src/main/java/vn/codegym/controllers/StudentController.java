package vn.codegym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.ClassRoom;
import vn.codegym.model.Student;
import vn.codegym.services.StudentService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping({"", "/student"})
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = {"", "/list"})
    public ModelAndView studentList(@PageableDefault(value = 2) Pageable pageable) {
        return new ModelAndView("/student/list", "studentList", studentService.findAll(pageable));
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
    public String createStudent(@Validated @ModelAttribute Student student, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new Student().validate(student, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/student/create";
        } else {
            studentService.save(student);
            redirectAttributes.addFlashAttribute("successMsg", "Create student: " + student.getName() + " success!");
            return "redirect:/student";
//        return "forward:/student";
        }
    }

    //
    @GetMapping(value = "/edit/{id}")
    public String showEditPage(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "/student/edit";
    }

    @PostMapping(value = "/edit")
    public String editStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes) {
        studentService.update(student);
        redirectAttributes.addFlashAttribute("successMsg", "Update student: " + student.getName() + " success!");
        return "redirect:/student";
    }

    @GetMapping("/search")
    public ModelAndView searchByText(@RequestParam String inputSearch, @PageableDefault(value = 10) Pageable pageable) {
        return new ModelAndView("/student/list", "studentList", studentService.findByInputText(inputSearch, pageable));
    }
}
