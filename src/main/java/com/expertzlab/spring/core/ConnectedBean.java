package com.expertzlab.spring.core;

/**
 * Created by gireeshbabu on 29/03/17.
 */
public class ConnectedBean {

    private String myName;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        System.out.println("Setting My Name");
        this.myName = myName;
    }
}
