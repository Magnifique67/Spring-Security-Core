package com.lab2.Spring.Security.Core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/menu")
    public String menu() {
        return "home";
    }

    @GetMapping("/manager")
    public String admin() {
        return "admin";
    }

    @GetMapping("/client")
    public String user() {
        return "user";
    }
}
