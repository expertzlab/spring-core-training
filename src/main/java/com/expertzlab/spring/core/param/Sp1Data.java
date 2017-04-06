package com.expertzlab.spring.core.param;

/**
 * Created by gireeshbabu on 05/04/17.
 */
public class Sp1Data extends Mydata {

    @Override
    public int getD(){
        System.out.println("in Sp1Data "+ d);
        return d;
    }
}
