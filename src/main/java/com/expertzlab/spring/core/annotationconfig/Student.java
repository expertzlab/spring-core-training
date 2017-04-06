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
        return name;
    }

    public int getAge() {
        return age;
    }
}