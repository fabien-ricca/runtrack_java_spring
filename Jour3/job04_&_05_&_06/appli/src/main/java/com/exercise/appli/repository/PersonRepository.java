package com.exercise.appli.repository;

import com.exercise.appli.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel, Integer> {

}
