package com.expertzlab.spring.core.automode;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by gireeshbabu on 05/04/17.
 */
public class MyBean {

    private YourBean yourBean;

    public void beanDefault(){
        yourBean.yDefault();
    }

    public void setyourBean(YourBean yBean) {
        this.yourBean = yBean;
    }
}
