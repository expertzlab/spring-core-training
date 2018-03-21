package com.expertzlab.spring.core.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 20/03/18.
 */

@Component
public class ProductFactory implements FactoryBean<Product> {


    public Product getObject(){
        Product p = new Product();
        p.setName("Soap");
        return p;
    }

    public Class<?> getObjectType() {
        return Product.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
