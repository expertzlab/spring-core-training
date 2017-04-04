package com.expertzlab.spring.core.aop;

import com.expertzlab.spring.core.postprocess.PrintHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 04/04/17.
 */
public class AopApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        MyClass mc = (MyClass) context.getBean("myClass");
        mc.myMethod();
    }
}
