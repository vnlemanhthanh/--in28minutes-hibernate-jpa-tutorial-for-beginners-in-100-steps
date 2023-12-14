/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.jpahibernate.repository;

import com.vnlemanhthanh.spring.jpahibernate.DemoApplication;
import com.vnlemanhthanh.spring.jpahibernate.entity.Passport;
import com.vnlemanhthanh.spring.jpahibernate.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class StudentRepositoryTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentRepository repository;

    @Autowired
    EntityManager em;

    @Test
    public void retrieveStudentAndPassportDetails() {
        Student student = em.find(Student.class, 20001L);
        logger.info("student -> {}", student);
        logger.info("passport -> {}", student.getPassport());
    }

    @Test
    public void retrievePassportAndAssociatedStudent() {
        Passport passport = em.find(Passport.class, 40001L);
        logger.info("passport -> {}", passport);
        logger.info("student -> {}", passport.getStudent());
    }

    @Test
    @Transactional
    public void someTest() {
        repository.someOperationToUnderstandPersistenceContext();
    }

    @Test
    public void findById() {
    }

    @Test
    public void deleteById() {
    }

    @Test
    public void save() {
    }

    @Test
    public void saveStudentWithPassPort() {
    }
}