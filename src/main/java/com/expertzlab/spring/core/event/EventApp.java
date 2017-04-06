package com.expertzlab.spring.core.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class EventApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("event.xml");
        MessagePublisher publisher = (MessagePublisher) context.getBean("publisher");
        publisher.sentMessage();
    }
}
