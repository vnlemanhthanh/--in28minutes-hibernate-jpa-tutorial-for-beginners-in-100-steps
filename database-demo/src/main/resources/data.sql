/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

/*create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);*/

INSERT INTO person (id, name, location, birth_date)
VALUES ( 10001, 'Thanh', 'SG', CURRENT_DATE );
insert into person (id, name, location, birth_date)
values ( 10002, 'Anh', 'Singapore', CURRENT_DATE );
insert into person (id, name, location, birth_date)
VALUES ( 10003, 'Khai', 'NY', CURRENT_DATE );
