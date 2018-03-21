package com.expertzlab.spring.core.automode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by gireeshbabu on 05/04/17.
 */

@Component
public class MyBean {

    @Resource(name = "yyBean")
    private KBean yBean;

    public void beanDefault(){
        yBean.yDefault();
    }
    
}
