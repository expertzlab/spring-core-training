package com.expertzlab.spring.core.param;

import org.springframework.stereotype.Component;

/**
 * Created by gireeshbabu on 04/04/17.
 */

@Component
public class MyClass {

    YourClass yourClass;

    public void myMethod(){
        System.out.println("In My Method");
        yourClass.yourMethod();
    }

    public void setYourClass(YourClass yourClass) {
        this.yourClass = yourClass;
    }
}
