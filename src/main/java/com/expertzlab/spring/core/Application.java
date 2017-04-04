package com.expertzlab.spring.core;

import com.expertzlab.spring.core.postprocess.PrintHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 22/03/17.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        PrintHello bean = (PrintHello) context.getBean("helloBean");
        bean.printHello();
    }
}
