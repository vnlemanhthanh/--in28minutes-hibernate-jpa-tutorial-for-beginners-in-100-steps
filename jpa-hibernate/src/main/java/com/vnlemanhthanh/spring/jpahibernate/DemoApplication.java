package com.vnlemanhthanh.spring.jpahibernate;

import com.vnlemanhthanh.spring.jpahibernate.entity.Review;
import com.vnlemanhthanh.spring.jpahibernate.repository.CourseRepository;
import com.vnlemanhthanh.spring.jpahibernate.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Review> reviews = new ArrayList<>();
        reviews.add(new Review("5", "Great Hands-on Stuff"));
        reviews.add(new Review("5", "Hatsoff."));

        courseRepository.addReviewsForCourse(10003L, reviews);

        //studentRepository.saveStudentWithPassPort();
    }
}
