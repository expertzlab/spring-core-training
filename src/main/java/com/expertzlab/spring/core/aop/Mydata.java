package com.expertzlab.spring.core.aop;

/**
 * Created by gireeshbabu on 05/04/17.
 */
public class Mydata {

    int d;

    public int getD() {
        System.out.println("in Mydata "+ d);
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
