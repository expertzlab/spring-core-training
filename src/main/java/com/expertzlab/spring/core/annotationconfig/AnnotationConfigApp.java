package com.expertzlab.spring.core.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class AnnotationConfigApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();
        Teacher teacher = (Teacher) context.getBean("teacher");
        teacher.printSubject();


        /*
        RequireBean requireBean = (RequireBean) context.getBean("reqBean");
        requireBean.defMethod();
        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();

        profile.printSubject();

        JSR250Annotations annotations = (JSR250Annotations) context.getBean("jsr250");
        annotations.printHi();
        ((AbstractApplicationContext)context).close();
        */
    }
}
