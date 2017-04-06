package com.expertzlab.spring.core.annotationconfig;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class Subject {

    public Subject(String name){
        this.subjectName = name;
    }

    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
