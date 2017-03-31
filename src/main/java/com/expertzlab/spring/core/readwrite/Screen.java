package com.expertzlab.spring.core.readwrite;

/**
 * Created by gireeshbabu on 31/03/17.
 */
public class Screen implements Writer {

    public String write(String str) {

        String message = "In Screen - "+str;
        System.out.println(message);
        return message;
    }
}
