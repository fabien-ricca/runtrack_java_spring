package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class ViewController {
    public static String messageIndex = "Bienvenue sur l'index.";

    public static List<Person> persons = Arrays.asList(
            new Person("Lea", 20),
            new Person("Corentin", 26),
            new Person("Fabien", 28)
    );


    @GetMapping("/")
    public String index(){
        return "index";
    }


}
