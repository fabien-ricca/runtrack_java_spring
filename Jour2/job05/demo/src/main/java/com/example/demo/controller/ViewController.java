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
    public static String nomForm;
    public static String ageForm;
    public static String msg;


    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/page2")
    public String page2(){
        return"page2";
    }

    @PostMapping("/index")
    public void postView(@RequestParam String name, @RequestParam String age){
        msg = (checkNotEmpty(name, age)) ? "Bonjour " + name + ", vous avez " + age : "Merci de remplir tous les champs." ;
    }

    public boolean checkNotEmpty(String name, String age){
        if((name == null ||name.isEmpty()) || (age == null || age.isEmpty())){
            return false;
        }
        else{
            return true;
        }
    }
}
