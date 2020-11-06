package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // Create a new Student object
        Student theStudent = new Student();

        // Add the Student object as a Model attribute
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }
}
