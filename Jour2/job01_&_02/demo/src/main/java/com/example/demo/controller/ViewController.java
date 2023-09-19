package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    public static String messageIndex = "Bienvenue sur l'index.";
    public static String message2 = "Bienvenue sur la page 2.";
    public static String message3 = "Bienvenue sur la page 3.";

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/page2")
    public String page2(){
        return "page2";
    }

    @GetMapping("/page3")
    public String page3(){
        return "page3";
    }

    public static String msg(){
        return "Bienvenue";
    }
}
