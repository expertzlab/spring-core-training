package com.expertzlab.spring.core.require;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by admin on 21/03/18.
 */
public class PrefixGen {

    String prefix;

    @Mandatory
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
