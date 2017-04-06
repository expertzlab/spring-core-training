package com.expertzlab.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gireeshbabu on 06/04/17.
 */
@Configuration
public class ConfigA {

    @Bean
    public A a(){
        return new A();
    }
}
