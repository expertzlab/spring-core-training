package com.expertzlab.spring.core.automode;

import com.expertzlab.spring.core.inherit.HelloKerala;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 05/04/17.
 */
public class AutoModeApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("automode.xml");
        MyBean bean = (MyBean) context.getBean("myBean");
        bean.beanDefault();
    }

}
