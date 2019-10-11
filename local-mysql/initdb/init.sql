create database human;
use human;

CREATE TABLE people
(
    person_id  BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20),
    last_name  VARCHAR(20)
);

INSERT INTO people (first_name, last_name)
VALUES ('Jill', 'Doe'),
       ('Joe', 'Doe'),
       ('Justin', 'Doe'),
       ('Jane', 'Doe'),
       ('John', 'Doe');

CREATE TABLE address1
(
    address_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    address1   VARCHAR(20),
    people_id  BIGINT
);

INSERT INTO address1 (address1, people_id)
VALUES ('Jill_house', 1),
       ('Joe_house', 2),
       ('justin_home', 3),
       ('jane_house', 4),
       ('John_house', 5);
