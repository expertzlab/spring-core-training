package com.expertzlab.spring.core.javaconfig;

import com.expertzlab.spring.core.annotationconfig.JavaConfig;
import com.expertzlab.spring.core.annotationconfig.Subject;
import com.expertzlab.spring.core.inherit.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class JavaConfigApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConfigB.class);

        context.refresh();


        A a = context.getBean(A.class);
        B b = context.getBean(B.class);
        a.printa();
        b.printB();


    }
}
