package com.expertzlab.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gireeshbabu on 06/04/17.
 */

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Foo foo(){
        return new Foo();
    }
}
