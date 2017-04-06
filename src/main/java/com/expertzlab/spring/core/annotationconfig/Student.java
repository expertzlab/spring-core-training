package com.expertzlab.spring.core.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class Student {

    private String name;
    private int age;


    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    @Autowired(required = false)
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("In Get Name");
        return name;
    }

    public int getAge() {
        System.out.println("In get Age");
        return age;
    }

    public void printThrowException(){
        System.out.println("Throwing IllegalarguemntException");
        throw new IllegalArgumentException();
    }
}
