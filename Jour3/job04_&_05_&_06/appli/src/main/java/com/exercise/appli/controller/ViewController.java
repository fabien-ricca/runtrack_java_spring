package com.exercise.appli.controller;

import com.exercise.appli.model.PersonModel;
import com.exercise.appli.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ViewController {

    private PersonService personService;

    public List<PersonModel> listUsers = new ArrayList<>();

    public ViewController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/getAll")
    public String getAll(){
        this.listUsers = personService.getAll();
        return "getAll";
    }

    @PostMapping("/index")
    public void add(@RequestParam String name, @RequestParam String age){
        PersonModel person = new PersonModel();
                    person.setName(name);
                    person.setAge(Integer.parseInt(age));

        personService.savePerson(person);
    }
}
