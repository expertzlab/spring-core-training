package com.expertzlab.spring.core.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Constructor;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class FooContainer {


    public FooContainer(FooExtension fooExt){
      this.varFoo = fooExt;
    }

    public FooContainer(){

    }

    private Foo varFoo;


    public void printFoo(){
         varFoo.printExt();
    }

    public void setVarFoo(FooExtension fooExtension) {
        this.varFoo = fooExtension;
    }
}
