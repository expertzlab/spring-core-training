package com.expertzlab.spring.core.annotationconfig;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class RequireBean {

    String reqString;

    @Required
    public void setReqString(String reqString) {
        this.reqString = reqString;
    }

    public void defMethod(){
        System.out.println("In require bean "+ reqString);
    }
}
