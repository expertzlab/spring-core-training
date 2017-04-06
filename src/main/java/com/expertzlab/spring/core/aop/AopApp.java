package com.expertzlab.spring.core.aop;

import com.expertzlab.spring.core.annotationconfig.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 07/04/17.
 */
public class AopApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        //student.printThrowException();

    }
}
