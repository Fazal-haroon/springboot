package com.example.demo.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

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
        /**
         * elvis operator ?: same like ternary operator
         * if and unless
         * switch case
         */
        model.addAttribute("isAdmin", false);
        model.addAttribute("gender", "F");
        return "elvis";
    }

    @GetMapping("/each")
    public String eachExample(Model model){
        List<String> stringList = Arrays.asList("First", "Second", "Third");
        model.addAttribute("list", stringList);
        return "each";
    }
}
