package com.expertzlab.spring.core.aop;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by gireeshbabu on 04/04/17.
 */

public class YourClass {

   int d1, d2;

    String p1, p2;

    public YourClass(int d1, int d2){
        this.d1 = d1;
        this.d2 = d2;
    }

    public void yourMethod(){
        System.out.println("In your Method - " + "d1 ="  + d1 + " d2 =" + d2);
        System.out.println("In your Method - " + "p1 ="  + p1 + " p2 =" + p2);
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }
}
