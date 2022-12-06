package com.example.demo.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/home")
    public String loadHome(Model model){
        model.addAttribute("name", "Thymeleaf");
        model.addAttribute("someValue", "sdfs");
        return "home";
    }

    @GetMapping("/ternary")
    public String elvisExample(Model model){
        model.addAttribute("isAdmin", true);
        return "elvis";
    }
}
