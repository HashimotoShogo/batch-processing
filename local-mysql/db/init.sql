create database human;
use human;

CREATE TABLE people  (
    person_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);

insert into people (first_name,last_name) values ('Jill','Doe'),('Joe','Doe'),('Justin','Doe'),('Jane','Doe'),('John','Doe');
