package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2023-01-10 16:14
 **/
@Component
public class DataInit {
    @Autowired
    JdbcTemplate jdbcTemplate;


    @PostConstruct
    public void init() {
        jdbcTemplate.update("CREATE TABLE IF NOT EXISTS users (" //
            + "id BIGINT IDENTITY NOT NULL PRIMARY KEY, " //
            + "email VARCHAR(100) NOT NULL, " //
            + "password VARCHAR(100) NOT NULL, " //
            + "name VARCHAR(100) NOT NULL, " //
            + "UNIQUE (email))");
    }

}
