/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.database.databasedemo;


import com.vnlemanhthanh.database.databasedemo.entity.Person;
import com.vnlemanhthanh.database.databasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao dao;

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}", dao.findAll());
        logger.info("User id 10001 -> {}", dao.findById(10001));
        logger.info("Delete user id 10002. No of row deleted -> {}", dao.deleteById(10002));
        logger.info("Inserting 10004 -> {}",
                dao.insert(new Person(10004, "Dung", "SG", new Date())));
        logger.info("Update user 10003 -> {}",
                dao.update(new Person(10003, "Khai", "Singapore", new Date())));

    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }
}
