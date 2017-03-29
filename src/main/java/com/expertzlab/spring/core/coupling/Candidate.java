package com.expertzlab.spring.core.coupling;

import org.springframework.util.Assert;

/**
 * Created by gireeshbabu on 21/03/17.
 */
public class Candidate {

    String name;
    String symbol;

    public Candidate(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        Assert.notNull(name);
        Assert.notNull(symbol);
        return name + symbol;
    }
}
