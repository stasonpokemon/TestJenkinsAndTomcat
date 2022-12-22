package com.aston.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(@RequestParam(name = "name", required = false, defaultValue = "Stanislau") String name,
                          Model model){
        System.out.println("aaa");
        model.addAttribute("name", name);
        return "welcome";
    }
}
