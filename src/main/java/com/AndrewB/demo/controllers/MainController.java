package com.AndrewB.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String greeting( Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/about")
    public String about( Model model) {
        model.addAttribute("title", "Про меня");
        return "about";
    }
    @GetMapping("/contact")
    public String contact ( Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

}