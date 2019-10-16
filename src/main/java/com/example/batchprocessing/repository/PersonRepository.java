package com.example.batchprocessing.Repository;


import com.example.batchprocessing.person.Person;
import jooq.human.tables.Address1;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static jooq.human.tables.People.PEOPLE;
import static jooq.human.tables.Address1.ADDRESS1;

@Repository
@Transactional(readOnly = true)
public class PersonRepository {


//    @Autowired
//    SettingMysql settingMysql;

    String url="jdbc:mysql://127.0.0.1:3306/human";

    //@Value("${spring.datasource.username}")
    String username="root";

    //@Value("${spring.datasource.password}")
    String password="root";

    public List<Person> getAllPersonInfo() throws SQLException { //SQLメモ書き　select first_name,last_name,address1 from people inner join address1 on people.person_id = address1.people_id;
        List<Person> list = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            DSLContext dslContext = DSL.using(con, SQLDialect.MYSQL_5_7);

            Result<Record4<Long,String,String,String>> result = dslContext.select(PEOPLE.PERSON_ID ,PEOPLE.FIRST_NAME ,PEOPLE.LAST_NAME ,ADDRESS1.ADDRESS1_).from(PEOPLE).join(ADDRESS1).on(PEOPLE.PERSON_ID.eq(ADDRESS1.PEOPLE_ID)).fetch();

            result.forEach(record -> list.add(new Person(record.get(PEOPLE.PERSON_ID), record.getValue(PEOPLE.FIRST_NAME), record.getValue(PEOPLE.LAST_NAME),record.getValue(ADDRESS1.ADDRESS1_))));

            return list;
        }


    }
}
