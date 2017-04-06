package com.expertzlab.spring.core.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class MessageLister implements ApplicationListener<StringMessage> {

    public void onApplicationEvent(StringMessage stringMessage) {
        System.out.println("Recieved - " + stringMessage.getMessage());
    }
}
