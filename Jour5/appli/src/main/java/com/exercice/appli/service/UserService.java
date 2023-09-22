package com.exercice.appli.service;

import com.exercice.appli.model.UserModel;
import com.exercice.appli.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(UserModel user){
        userRepository.save(user);
    }

    public List<UserModel> findAll(){
        return userRepository.findAll();
    }
}
