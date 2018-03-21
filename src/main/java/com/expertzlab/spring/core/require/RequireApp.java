package com.expertzlab.spring.core.require;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 21/03/18.
 */
public class RequireApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("require.xml");
        PrefixGen p = (PrefixGen) cc.getBean("gen");
    }
}
