package com.expertzlab.spring.core;

import com.expertzlab.spring.core.postprocess.PrintHello;
import org.springframework.stereotype.Component;

/**
 * Created by gireeshbabu on 22/03/17.
 */

@Component
public class HelloBean implements PrintHello {

    public void printHello(){
        System.out.println("Hello world!");
    }
}
