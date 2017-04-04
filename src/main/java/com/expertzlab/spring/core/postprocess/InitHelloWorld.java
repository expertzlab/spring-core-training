package com.expertzlab.spring.core.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by gireeshbabu on 04/04/17.
 */

public class InitHelloWorld implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return bean; // you can return any other object as well
    }

    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName);

        if("helloBean".equals(beanName)) {
            return new DanyHello();
        } else {
            return bean;
        }

    }
}
