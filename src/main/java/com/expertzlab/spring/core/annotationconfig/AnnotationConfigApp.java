package com.expertzlab.spring.core.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class AnnotationConfigApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotateconfig.xml");
        RequireBean requireBean = (RequireBean) context.getBean("reqBean");
        requireBean.defMethod();


        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();


        profile.printSubject();


        JSR250Annotations annotations = (JSR250Annotations) context.getBean("jsr250");
        annotations.printHi();
        ((AbstractApplicationContext)context).close();

    }
}
