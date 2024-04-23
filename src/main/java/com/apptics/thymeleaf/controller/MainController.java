package com.apptics.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Ponsiano Thomas");
        model.addAttribute("lastName", "de loor sizalema");
        model.addAttribute("message", "Hello, World!");
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("isAdmin", true);
        model.addAttribute("country", "EC");
        return "admin";
    }
}
