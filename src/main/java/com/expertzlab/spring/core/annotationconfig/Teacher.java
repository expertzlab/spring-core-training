package com.expertzlab.spring.core.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by gireeshbabu on 06/04/17.
 */
@Component
public class Teacher {


    @Autowired
    private Subject subject;

    public void printSubject(){
        System.out.println("Sub -" + subject.getSubjectName());
    }
}
