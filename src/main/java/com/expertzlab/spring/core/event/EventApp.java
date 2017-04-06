package com.expertzlab.spring.core.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class EventApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("event.xml");
        context.start();
        context.stop();
    }
}
