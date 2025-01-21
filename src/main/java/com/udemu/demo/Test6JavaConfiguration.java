package com.udemu.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6JavaConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
