package com.swarnab.spring_first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
        // STEP 1 : Launch a Spring context
        var context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);
        // STEP 2 : Configure the things we want spring to manage - @Configurations
        // Beans

        // STEP 3 : Retreiving Beans
        System.out.println(context.getBean("name"));

    }
}
