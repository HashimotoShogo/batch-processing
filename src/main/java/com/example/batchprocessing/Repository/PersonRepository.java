package com.example.batchprocessing.Repository;


import com.example.batchprocessing.SettingMysql;
import com.example.batchprocessing.person.Person;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static jooq.human.tables.People.PEOPLE;

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

    public List<Person> getAllPersonInfo() throws SQLException {
        List<Person> list = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            DSLContext dslContext = DSL.using(con, SQLDialect.MYSQL_5_7);

            Result<Record> result = dslContext.select().from(PEOPLE).fetch();
            
            result.forEach(record -> list.add(new Person(record.get(PEOPLE.PERSON_ID), record.getValue(PEOPLE.FIRST_NAME), record.getValue(PEOPLE.LAST_NAME))));

            return list;
        }


    }
}
