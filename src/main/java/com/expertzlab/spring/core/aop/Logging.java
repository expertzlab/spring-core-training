package com.expertzlab.spring.core.aop;

/**
 * Created by gireeshbabu on 07/04/17.
 */
public class Logging {

    public void beforeAdvice(){
        System.out.println("Before advice");
    }

    public void afterAdvice(){
        System.out.println("After advice");
    }

    public void afterReturningAdvice(Object returnVal){
        System.out.println("After returning - " + returnVal.toString());

    }

    public void afterThrowingExceptionAdvice(IllegalArgumentException exception){
        System.out.println("Exception thrown "+ exception.toString());
    }
}
