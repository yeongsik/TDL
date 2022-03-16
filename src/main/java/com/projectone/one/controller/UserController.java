package com.projectone.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "user/login";
    }

    @PostMapping("/auth")
    public String auth(Model model) {
        String id = model.getAttribute("id").toString();
        return "/";
    }
}
