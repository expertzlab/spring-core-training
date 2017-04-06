package com.expertzlab.spring.core.jdbc;

import com.expertzlab.spring.core.annotationconfig.Student;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by gireeshbabu on 07/04/17.
 */
public class StudentDAO {

    private JdbcTemplate jdbcTemplate;

    public void create(Student student){

        jdbcTemplate.update("insert into student (name, age)" +
                "values (?,?)",student.getName(),student.getAge());
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
