package com.expertzlab.spring.core.customevents;

import com.expertzlab.spring.core.annotationconfig.AnnotationConfigApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by admin on 19/03/18.
 */
public class MyApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Config.class);
        ac.refresh();

        Publisher p = (Publisher) ac.getBean(Publisher.class);
        p.sendMessage("From GFL");
    }


}
