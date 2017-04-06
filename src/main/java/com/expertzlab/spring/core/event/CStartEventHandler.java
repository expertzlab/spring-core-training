package com.expertzlab.spring.core.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {


    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("Context started Event Received");
    }
}
