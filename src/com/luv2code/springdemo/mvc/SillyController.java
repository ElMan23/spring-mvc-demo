package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SillyController {

    // Need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String displayTheForm() {
        return "helloworld-form";
    }
}
