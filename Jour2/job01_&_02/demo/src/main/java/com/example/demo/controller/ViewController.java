package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    public String message = "Bonjour";

    @GetMapping("/")
    public String view(Model model){
        model.addAttribute("message", msg());
        return "view";
    }

    public static String msg(){
        return "Bienvenue";
    }
}
