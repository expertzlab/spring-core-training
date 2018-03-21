package com.expertzlab.spring.core.customevents;

import org.springframework.context.ApplicationListener;

/**
 * Created by admin on 19/03/18.
 */
public class CListener implements ApplicationListener<CustomEvent> {

    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("Event:"+customEvent.toString());
    }
}
