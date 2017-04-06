package com.expertzlab.spring.core.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class StringMessage extends ApplicationEvent {

    private String message;

    public StringMessage(Object source) {
        super(source);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
