package com.expertzlab.spring.core.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by gireeshbabu on 06/04/17.
 */
public class Profile {

    //@Qualifier("student1")
    private Student student;


    @Resource(name = "teacher")
    private Teacher teacher;

    @Autowired(required = false)
    private Subject subject;


    public void printAge(){
        System.out.println("Age -" + student.getAge());

    }

    public void printName(){
        System.out.println("Name - "+ student.getName());
    }


    public void printSubject(){
        System.out.println("Subject - ");
        teacher.printSubject();
        if(subject.getSubjectName() != null) {
            System.out.println("Or");
            System.out.println(subject.getSubjectName());
        }
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }



    @Qualifier("student2")
    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }
}
