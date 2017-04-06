package com.expertzlab.spring.core.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class MessagePublisher implements ApplicationEventPublisherAware {

    ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void sentMessage(){

        StringMessage message = new StringMessage(this);
        message.setMessage("Hai Please send me reply");
        publisher.publishEvent(message);

    }
}
