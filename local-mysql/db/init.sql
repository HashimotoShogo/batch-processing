create database human;
use human;

CREATE TABLE people  (
    person_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);

insert into people (first_name,last_name) values ('Jill','Doe'),('Joe','Doe'),('Justin','Doe'),('Jane','Doe'),('John','Doe');

CREATE TABLE address1 (
    address_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    address1 VARCHAR(20),
    people_id BIGINT
);

insert into address1 (address1,people_id) values ('Jill_house',1),('Joe_house',2),('justin_home',3),('jane_house',4),('John_house',5);