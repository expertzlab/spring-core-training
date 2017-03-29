package com.expertzlab.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 22/03/17.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        HelloBean bean = (HelloBean) context.getBean("helloBean");
        bean.printHello();
        bean = (HelloBean) context.getBean("helloBeanXML");
        bean.printHello();
    }
}
