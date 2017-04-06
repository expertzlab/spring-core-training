package com.expertzlab.spring.core.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class InitDestroyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        FooExtension extension = context.getBean(FooExtension.class);
        extension.setMessage("Initial Value");

        FooContainer fooContainer = context.getBean(FooContainer.class);
        fooContainer.printFoo();
    }


}
