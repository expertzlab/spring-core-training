package com.expertzlab.spring.core.generics;

import com.expertzlab.spring.core.factory.Product;

/**
 * Created by admin on 20/03/18.
 */
public class GenericFactory<T>  {

    Class<?> c;

    public GenericFactory(Class<?> c){
        this.c = c;
    }

    public Class<?> getObjectType(){
        return c;
    }

    public T getObject() throws IllegalAccessException, InstantiationException {
        try {
            return (T) getObjectType().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}

