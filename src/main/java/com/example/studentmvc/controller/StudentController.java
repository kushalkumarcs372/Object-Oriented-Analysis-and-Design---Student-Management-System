package com.example.studentmvc.controller;

import com.example.studentmvc.model.Student;
import com.example.studentmvc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {

        model.addAttribute("students", service.getAllStudents());
        model.addAttribute("student", new Student());

        return "index";
    }

    @PostMapping("/api/students")
    public String saveStudent(@ModelAttribute Student student) {

        service.saveStudent(student);

        return "redirect:/";
    }
}