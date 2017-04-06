package com.expertzlab.spring.core.inheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 31/03/17.
 */
public class InheritanceApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath*:**/inheritance-context.xml");
        HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
        HelloIndia hi = (HelloIndia) context.getBean("helloIndia");

        hw.getMessage1(); hw.getMessage2();

        hi.getMessage1(); hi.getMessage2(); hi.getMessage3();
        context.registerShutdownHook();
    }
}
