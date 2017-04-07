package com.expertzlab.spring.core.jdbc;

import com.expertzlab.spring.core.annotationconfig.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 07/04/17.
 */
public class JdbcApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        StudentDAO dao = (StudentDAO) context.getBean("studentDao");
        Student student = new Student();
        student.setAge(25);
        student.setName("Binu");
        dao.create(student);
        ((AbstractApplicationContext)context).registerShutdownHook();

        for(Student s: dao.getAllStudent()){
            System.out.println("Name - "+s.getName());
            System.out.println("Age - "+ s.getAge());
            System.out.println("------------");
        }
        ((AbstractApplicationContext) context).stop();
        //((AbstractApplicationContext) context).
        ((AbstractApplicationContext)context).close();

    }
}
