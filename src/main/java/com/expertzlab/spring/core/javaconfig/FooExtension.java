package com.expertzlab.spring.core.javaconfig;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class FooExtension extends Foo {

    String message;

    @Override
    public void printExt(){
        System.out.println("Foo Extension" + message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
