package com.apptics.thymeleaf.controller;

import com.apptics.thymeleaf.model.Country;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("name", "Ponsiano Thomas");
        model.addAttribute("lastName", "de loor sizalema");
        model.addAttribute("message", "Hello, World!");
        return "home";
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

    @GetMapping("/iterate")
    public String iterate(Model model) {
        model.addAttribute("countries", new String[]{"EC", "CO", "PE", "BR", "AR"});
        return "iterate";
    }

    @GetMapping("/countries")
    public String iteratePersons(Model model) {
        List<Country> countries = List.of(
                new Country("Ecuador", "Quito", "17.4M"),
                new Country("Colombia", "Bogota", "50.3M"),
                new Country("Peru", "Lima", "32.5M"),
                new Country("Brazil", "Brasilia", "212.6M"),
                new Country("Argentina", "Buenos Aires", "45.3M")
        );

        model.addAttribute("countries", countries);
        return "countries";
    }
}
