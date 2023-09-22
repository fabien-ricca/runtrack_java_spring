package com.exercise.appli.service;

import com.exercise.appli.model.PersonModel;
import com.exercise.appli.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void savePerson(PersonModel personModel){
        personRepository.save(personModel);
    }

    public List<PersonModel> getAll(){
        return personRepository.findAll();
    }

    public PersonModel findByName(String name){
        return personRepository.findByNameIs(name);
    }
}
