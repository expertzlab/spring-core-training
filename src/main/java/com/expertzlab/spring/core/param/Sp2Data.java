package com.expertzlab.spring.core.param;

/**
 * Created by gireeshbabu on 05/04/17.
 */
public class Sp2Data extends Mydata {

    @Override
    public int getD(){
        System.out.println("in Sp2Data "+ d);
        return d;
    }
}
