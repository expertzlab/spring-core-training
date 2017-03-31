package com.expertzlab.spring.core.readwrite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Created by gireeshbabu on 31/03/17.
 */
public class RWApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("readwrite.xml");
        PrinterService ps = (PrinterService) context.getBean("printerService");
        ps.process();
    }
}
