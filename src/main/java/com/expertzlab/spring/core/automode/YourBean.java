package com.expertzlab.spring.core.automode;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by gireeshbabu on 05/04/17.
 */


@Component
public class YourBean implements KBean{

    public void yDefault(){
        System.out.println("in YourBean default method");
    }

}
