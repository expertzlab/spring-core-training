package com.expertzlab.spring.core.annotationconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class JSR250Annotations {

    @PostConstruct
    public void init(){
        System.out.println("Init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("In Destroy method");
    }

    public void printHi(){
        System.out.println("Hi !");
    }
}
