package com.expertzlab.spring.core.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by gireeshbabu on 04/04/17.
 */

@Component
public class MyClass {

    @Autowired
    YourClass yourClass;

    public void myMethod(){
        System.out.println("In My Method");
        yourClass.yourMethod();
    }
}
