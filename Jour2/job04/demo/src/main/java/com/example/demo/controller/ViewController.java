package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class ViewController {
    public static String messageIndex = "Bienvenue sur l'index.";
    public static String messageForm;


    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/index")
    public void postView(@RequestParam String name){
        messageForm = "Merci pour la soumission, "+name;
    }
}
