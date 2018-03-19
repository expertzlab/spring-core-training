package com.expertzlab.spring.core.automode;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 16/03/18.
 */

@Component
public class YyBean implements KBean {

    public void yDefault(){
        System.out.println("in YBean default method");
    }
}
