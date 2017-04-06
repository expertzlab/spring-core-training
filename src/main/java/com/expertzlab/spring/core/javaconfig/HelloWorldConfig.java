package com.expertzlab.spring.core.javaconfig;

import com.expertzlab.spring.core.inherit.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gireeshbabu on 06/04/17.
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld getHelloWorld(){
        return new HelloWorld();
    }

    @Bean
    public String getString(){
        return new String("I like expertzlab");
    }

}
