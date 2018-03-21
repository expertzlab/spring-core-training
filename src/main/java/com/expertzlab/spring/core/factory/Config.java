package com.expertzlab.spring.core.factory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 20/03/18.
 */

@Configuration
public class Config {

    @Bean
    @Profile("dev")
    public Product devProduct(@Value("${name}") String name) {
        Product p = new Product();
        p.setName(name + " Oil");
        return p;
    }

    @Bean
    @Profile("prod")
    public Product prodProduct(@Value("${name}") String name) {
        Product p = new Product();
        p.setName(name + " Soap");
        return p;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }


}
