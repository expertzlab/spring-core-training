package com.expertzlab.spring.core.customevents;

import org.springframework.context.ApplicationEvent;

/**
 * Created by admin on 19/03/18.
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }
}
