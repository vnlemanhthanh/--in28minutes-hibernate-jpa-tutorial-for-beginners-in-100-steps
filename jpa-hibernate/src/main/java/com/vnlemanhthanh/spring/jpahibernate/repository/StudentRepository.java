/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.jpahibernate.repository;

import com.vnlemanhthanh.spring.jpahibernate.entity.Passport;
import com.vnlemanhthanh.spring.jpahibernate.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 *
 */
@Repository
@Transactional
public class StudentRepository {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    /**
     * @param id
     * @return
     */
    public Student findById(Long id) {
        return em.find(Student.class, id);
    }

    /**
     * @param id
     */
    public void deleteById(Long id) {
        Student student = findById(id);
        em.remove(student);
    }

    public Student save(Student student) {
        if (student.getId() == null) {
            em.persist(student);
        } else {
            em.merge(student);
        }
        return student;
    }

    public void saveStudentWithPassPort() {
        Passport passport = new Passport("Z123456");
        em.persist(passport);

        Student student = new Student("Dung");
        student.setPassport(passport);
        em.persist(student);
    }

}
