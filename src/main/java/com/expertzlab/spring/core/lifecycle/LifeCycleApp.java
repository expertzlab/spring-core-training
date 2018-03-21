package com.expertzlab.spring.core.lifecycle;

import com.expertzlab.spring.core.HelloBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 31/03/17.
 */
public class LifeCycleApp {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        HelloBean hbean = (HelloBean) context.getBean("helloBean");

        context.registerShutdownHook();
    }
}
