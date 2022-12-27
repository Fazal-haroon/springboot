package com.example.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
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
                    VALUES (4, 'Abdul Hanan', 'Son');
                    """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
