package com.expertzlab.spring.core.annotationconfig;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class Teacher {

    private String subject;

    public void printSubject(){
        System.out.println("Sub -" + subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
