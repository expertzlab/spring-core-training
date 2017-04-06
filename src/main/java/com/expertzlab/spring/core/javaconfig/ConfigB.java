package com.expertzlab.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by gireeshbabu on 06/04/17.
 */

@Import(ConfigA.class)
@Configuration
public class ConfigB {

    @Bean
    public B b(){
        return new B();
    }
}
