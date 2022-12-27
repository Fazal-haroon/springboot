package com.example.learnjpaandhibernate.jdbc;

import com.example.learnjpaandhibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    //this is called a text block, in here you can type whatever you would want. TRIPLE inverted commas
    private static String INSERT_QUERY =
            """
                    INSERT INTO COURSE(ID, NAME, AUTHOR)
                    VALUES (?, ?, ?);
                    """;

    private static String DELETE_QUERY =
            """
                    DELETE FROM course WHERE id = ? ;
                    """;

    private static String SELECT_QUERY =
            """
                    SELECT * FROM course WHERE id = ? ;
                    """;


    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id){
        //ResultSet -> Bean => Row Mapper =>
        //id
        Course course = springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
        return course;
    }
}
