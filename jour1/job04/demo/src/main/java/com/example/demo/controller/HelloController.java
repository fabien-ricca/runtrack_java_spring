package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Value;

@Controller     // Indique que cette classe est un contrôleur Spring MVC.
public class HelloController {
    @Value("${greeting.message}")
    private String monMessage;

    @GetMapping("/")     // Indique que cette méthode doit être invoquée lorsque quelqu'un accède à l'URL racine.
    @ResponseBody          // Indique que la chaîne retournée par la méthode doit être envoyée telle quelle
                           // dans le corps de la réponse HTTP, plutôt que d'être utilisée pour rechercher une vue.
    public String hello(){
        return "Hello world " + this.monMessage;
    }
}
