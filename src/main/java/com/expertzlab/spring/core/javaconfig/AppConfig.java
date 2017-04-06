package com.expertzlab.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by gireeshbabu on 06/04/17.
 */

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public FooExtension fooExtension(){
        return new FooExtension();
    }


    @Scope("prototype")
    @Bean
    public FooContainer container(){
        return new FooContainer();
    }

}
