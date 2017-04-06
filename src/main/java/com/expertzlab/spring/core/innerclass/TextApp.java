package com.expertzlab.spring.core.innerclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 05/04/17.
 */
public class TextApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("textedit.xml");
        TextEditor editor = (TextEditor) context.getBean("textEditor");
        editor.checkSpelling();
    }
}
