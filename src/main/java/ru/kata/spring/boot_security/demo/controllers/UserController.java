package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UserController {
    @GetMapping("/")
    public String homePage() {
        return "/index";
    }

    @GetMapping("/user")
    public String pageForAuthenticatedUsers() {
        return "user";
    }

    @GetMapping("/admin")
    public String pageForAdmin() {
        return "admin";
    }

}