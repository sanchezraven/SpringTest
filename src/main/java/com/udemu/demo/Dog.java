package com.udemu.demo;

public class Dog implements Pet{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("wow wow");
    }

    public void init() {
        System.out.println("Class Dog: init");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy");
    }
}
