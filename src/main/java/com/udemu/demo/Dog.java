package com.udemu.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
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

    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy");
    }
}
