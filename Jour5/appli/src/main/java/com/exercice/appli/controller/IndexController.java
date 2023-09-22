package com.exercice.appli.controller;

import com.exercice.appli.model.UserModel;
import com.exercice.appli.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    private UserService userService;
    public List<UserModel> usersList = new ArrayList<>();

    public IndexController(UserService userService){
        this.userService = userService;
    }


    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("userModel", new UserModel());
        usersList = userService.findAll();
        return "index";
    }


    @PostMapping("/index")
    public String addUser(@ModelAttribute UserModel userModel){
        userService.addUser(userModel);
        return "redirect:/index";
    }
}
