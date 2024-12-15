package com.udemu.demo;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person is created");
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
