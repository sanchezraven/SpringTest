package com.udemu.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6JavaConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat = context.getBean("catBean", Pet.class);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
