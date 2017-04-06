package com.expertzlab.spring.core.aop;

import org.aspectj.lang.annotation.*;

/**
 * Created by gireeshbabu on 07/04/17.
 */
@Aspect
public class Logging {

    @Pointcut("execution(* com.expertzlab.spring.core.annotationconfig.Student.*(..))")
    private void selectAll(){}

    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("Before advice");
    }

    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("After advice");
    }

    @AfterReturning(pointcut = "selectAll()",returning = "returnVal")
    public void afterReturningAdvice(Object returnVal){
        System.out.println("After returning - " + returnVal.toString());

    }

    @AfterThrowing(pointcut = "selectAll()",throwing = "exception")
    public void afterThrowingExceptionAdvice(IllegalArgumentException exception){
        System.out.println("Exception thrown "+ exception.toString());
    }
}
