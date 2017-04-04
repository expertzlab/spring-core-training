package com.expertzlab.spring.core.inherit;

import com.expertzlab.spring.core.postprocess.PrintHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 04/04/17.
 */
public class InApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inherit.xml");
        HelloKerala bean = (HelloKerala) context.getBean("helloKerala");
        bean.getMessage1();
        bean.getMessage2();
        bean.getMessage3();

        HelloIndia Indbean = (HelloIndia) context.getBean("helloIndia");
        Indbean.getMessage1();
        Indbean.getMessage2();
        Indbean.getMessage3();

        HelloWorld wdbean = (HelloWorld) context.getBean("helloWorld");
        wdbean.getMessage1();
        wdbean.getMessage2();
        wdbean.getMessage3();
        wdbean.getMessage4();

    }
}
