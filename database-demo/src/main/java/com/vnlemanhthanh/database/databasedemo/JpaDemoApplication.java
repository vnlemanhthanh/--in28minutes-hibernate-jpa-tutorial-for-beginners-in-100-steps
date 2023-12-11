/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.database.databasedemo;


import com.vnlemanhthanh.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;


//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //@Autowired
    PersonJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("User id 10001 -> {}", repository.findById(10001));

//        logger.info("All users -> {}", repository.findAll());
//        logger.info("Delete user id 10002. No of row deleted -> {}", repository.deleteById(10002));
//        logger.info("Inserting 10004 -> {}",
//                repository.insert(new Person(10004, "Dung", "SG", new Date())));
//        logger.info("Update user 10003 -> {}",
//                repository.update(new Person(10003, "Khai", "Singapore", new Date())));

    }

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }
}
