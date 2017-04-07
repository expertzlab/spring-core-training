package com.expertzlab.spring.core.jdbc;

import com.expertzlab.spring.core.annotationconfig.Student;
import com.mysql.fabric.xmlrpc.base.Data;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by gireeshbabu on 07/04/17.
 */
public class StudentDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDatasource(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
        this.dataSource = dataSource;
    }


    public void create(Student student){

        jdbcTemplate.update("insert into student (name, age)" +
                "values (?,?)",student.getName(),student.getAge());
    }

    public List<Student> getAllStudent(){
        return jdbcTemplate.query("select id, name, age from student", new StudentRowMapper());
    }

    public void destroy(){
        if(!((BasicDataSource) dataSource).isClosed()){
            try {
                ((BasicDataSource) dataSource).close();
            } catch (SQLException e) {
                System.out.println("Connection close failed");
            }
        }
    }

    class StudentRowMapper implements RowMapper<Student>{

        public Student mapRow(ResultSet resultSet, int i) throws SQLException {

            Student s = new Student();
            s.setId(resultSet.getInt(1));
            s.setName(resultSet.getString(2));
            s.setAge(resultSet.getInt(3));
            return s;
        }


    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
