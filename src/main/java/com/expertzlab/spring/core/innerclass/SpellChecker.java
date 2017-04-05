package com.expertzlab.spring.core.innerclass;

/**
 * Created by gireeshbabu on 05/04/17.
 */
public class SpellChecker {

    int order;

    public SpellChecker(int order){
        this.order = order;
    }
    public void check(){
        System.out.println("Checking the Spelling -" + order);
    }
}
