package com.udemu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

    @Autowired
    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person is created");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello my pet");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("class Person: set Pet");
        this.pet = pet;
    }
}
