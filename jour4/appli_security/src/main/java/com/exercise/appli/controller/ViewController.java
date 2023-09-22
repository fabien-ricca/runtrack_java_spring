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


    /////// Page index \\\\\\\
    @GetMapping("/")
    public String index(){
        return "index";
    }


    /////// Page getAll \\\\\\\
    @GetMapping("/getAll")
    public String getAll(){
        this.listUsers = personService.getAll();
        return "getAll";
    }


    /////// Page inscription \\\\\\\
    @GetMapping("/inscript")
    public String inscript(){
        return "inscript";
    }

    @PostMapping("/inscript")
    public void add(@RequestParam String name, @RequestParam String age, @RequestParam String mdp){
        PersonModel person = new PersonModel();
                    person.setName(name);
                    person.setAge(Integer.parseInt(age));
                    person.setMdp(mdp);

        personService.savePerson(person);
    }


    /////// Page connection \\\\\\\
    @GetMapping("/connect")
    public String connect(){
        return "connect";
    }

    @PostMapping("/connect")
    public String logIn(@RequestParam String name, @RequestParam String mdp){
        PersonModel user = this.personService.findByName(name);
        return "index";
    }
}
