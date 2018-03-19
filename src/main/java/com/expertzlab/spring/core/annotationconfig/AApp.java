package com.expertzlab.spring.core.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 16/03/18.
 */
public class AApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aapp.xml");
        JSR250Annotations jsr = (JSR250Annotations) context.getBean("jSR250Annotations");
        jsr.printHi();
        context.close();
    }
}
