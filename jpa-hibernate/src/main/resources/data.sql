/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

insert into course(id, name, created_date, last_updated_date)
    values(10001, 'JPA in 50 Steps', CURRENT_DATE, CURRENT_DATE);
insert into course(id, name, created_date, last_updated_date)
    values(10002, 'Spring in 50 Steps', CURRENT_DATE, CURRENT_DATE);
insert into course(id, name, created_date, last_updated_date)
    values(10003, 'Spring Boot in 100 Steps', CURRENT_DATE, CURRENT_DATE);

insert into passport (id, number) values (40001, 'E123456');
insert into passport (id, number) values (40002, 'N123457');
insert into passport (id, number) values (40003, 'L123890');

insert into student(id, name, passport_id) values (20001, 'Thanh', 40001);
insert into student(id, name, passport_id) values (20002, 'Anh', 40002);
insert into student(id, name, passport_id) values (20003, 'Khai', 40003);

insert into review (id, rating, description, course_id) values (50001, '5', 'Great Course', 10001L);
insert into review (id, rating, description, course_id) values (50002, '4', 'Wonderful Course', 10001L);
insert into review (id, rating, description, course_id) values (50003, '5', 'Awesome Course', 10003L);