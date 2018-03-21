package com.expertzlab.spring.core.factory;

import org.omg.CORBA.Environment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.Collections;


/**
 * Created by admin on 20/03/18.
 */
public class FactoryApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment ev = ac.getEnvironment();
        ev.setActiveProfiles(args[0]);

        MutablePropertySources mps = ev.getPropertySources();
        mps.addLast( new MapPropertySource("mapSource", Collections.singletonMap("name",(Object)"ProductType")));

        ac.register(Config.class);
        ac.refresh();

        Product p = ac.getBean(Product.class);
        System.out.println(p.getName());
    }
}
