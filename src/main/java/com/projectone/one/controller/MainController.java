package com.projectone.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class MainController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("data", "Hello");
        return "index";
    }


}
