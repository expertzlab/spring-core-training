package com.expertzlab.spring.core.param;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 04/04/17.
 */
public class ParamApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("param.xml");
        MyClass mc = (MyClass) context.getBean("myClass");
        mc.myMethod();
    }
}
