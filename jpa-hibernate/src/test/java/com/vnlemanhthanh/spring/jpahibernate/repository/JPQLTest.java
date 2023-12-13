/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.jpahibernate.repository;

import com.vnlemanhthanh.spring.jpahibernate.DemoApplication;
import com.vnlemanhthanh.spring.jpahibernate.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class JPQLTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    @Test
    public void findById_basic() {
        List resultList = em.createQuery("Select c From Course c").getResultList();
        logger.info("Select c From Course c -> {} ", resultList);
    }

    @Test
    public void findById_type() {
        TypedQuery<Course> query = em.createQuery("Select c From Course c", Course.class);
        List<Course> resultList = query.getResultList();
        logger.info("Select c From Course c -> {} ", resultList);
    }

    @Test
    public void findById_where() {
        TypedQuery<Course> query = em.createQuery("Select c From Course c Where name like '%100 Steps'", Course.class);
        List<Course> resultList = query.getResultList();
        logger.info("Select c From Course c Where name like '100 Steps' -> {}", resultList);

    }

}