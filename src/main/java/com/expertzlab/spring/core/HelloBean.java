package com.expertzlab.spring.core;

import com.expertzlab.spring.core.postprocess.PrintHello;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by gireeshbabu on 22/03/17.
 */

public class HelloBean implements InitializingBean, DisposableBean {

    int a;
    int b;
    int ab;

    public void afterPropertiesSet() throws Exception {
        System.out.println("in after property Set");
        ab = a *b;

    }

    public void setA(int a) {
        System.out.println("in setA");
        this.a = a;
    }

    public void setB(int b) {
        System.out.println("in setB");
        this.b = b;
    }

    public void setAb(int ab) {
        System.out.println("in setAB");
        this.ab = ab;
    }

    public void destroy() throws Exception {
        System.out.println("In destroy");
    }

    public void init(){
        System.out.println(" in Init");
    }

    public void close(){
        System.out.println("in close");
    }
}
