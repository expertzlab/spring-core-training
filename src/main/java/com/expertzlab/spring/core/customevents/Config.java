package com.expertzlab.spring.core.customevents;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 19/03/18.
 */

@Configuration
public class Config {

    @Bean
    public Publisher publisher(){
       return new Publisher();
    }

   @Bean
    ApplicationListener<CustomEvent> listener(){
      return   new CListener();
   }
}
