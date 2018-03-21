package com.expertzlab.spring.core.customevents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by admin on 19/03/18.
 */
public class Publisher implements ApplicationEventPublisherAware {

    ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void sendMessage(String msg){
        publisher.publishEvent(new CustomEvent(msg));
    }
}
