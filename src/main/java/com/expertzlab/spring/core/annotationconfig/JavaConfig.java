package com.expertzlab.spring.core.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gireeshbabu on 06/04/17.
 */
@Configuration
public class JavaConfig {

    @Bean
    public Subject subject(){
        return new Subject("Chemistry");
    }

    @Bean
    public Teacher teacher(){
        return new Teacher();
    }
}
