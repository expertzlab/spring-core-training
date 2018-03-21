package com.expertzlab.spring.core.generics;

import com.expertzlab.spring.core.factory.Oil;
import com.expertzlab.spring.core.factory.Product;
import com.expertzlab.spring.core.factory.Soap;

/**
 * Created by admin on 20/03/18.
 */
public class App {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Product p = new GenericFactory<Soap>(Soap.class).getObject();
         System.out.println(p.getName());

        p = new GenericFactory<Oil>(Oil.class).getObject();
        System.out.println(p.getName());

    }

}
