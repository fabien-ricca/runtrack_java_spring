package com.exercise.appli.service;

import com.exercise.appli.model.PersonModel;
import com.exercise.appli.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class PersonService implements PersonRepository {
    @Autowired
    private PersonRepository personRepository;

    public PersonModel savePerson(PersonModel personModel){
        return (PersonModel) personRepository.save(personModel);
    }
}
