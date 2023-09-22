package com.exercise.appli.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PERSON_MODEL")
public class PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "mdp")
    private String mdp;


    // Getters & Setters \\
    public int getId() { return this.id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }

    public String getMdp() { return this.mdp; }
    public void setMdp(String mdp) { this.mdp = mdp; }

}
