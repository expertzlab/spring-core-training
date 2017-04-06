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
        //context.register(JavaConfig.class, HelloWorldConfig.class, ConfigB.class);
        context.register(HelloWorldConfig.class, JavaConfig.class, ConfigB.class);
        context.refresh();

        HelloWorld hw = context.getBean(HelloWorld.class);
        hw.setMessage1("Message 1");
        System.out.println(hw.getMessage1());


        Subject subject = context.getBean(Subject.class);

        subject.setSubjectName("Subject - Maths");
        System.out.println( subject.getSubjectName());


        A a = context.getBean(A.class);
        B b = context.getBean(B.class);
        a.printa();
        b.printB();

    }
}
