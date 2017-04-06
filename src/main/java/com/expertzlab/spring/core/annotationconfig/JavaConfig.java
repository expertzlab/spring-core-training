package com.expertzlab.spring.core.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gireeshbabu on 06/04/17.
 */
@Configuration
public class JavaConfig {

    @Bean
    public Subject getSubject(){
        return new Subject("Physics");
    }
}
