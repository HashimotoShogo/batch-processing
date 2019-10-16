package com.example.batchprocessing.Service;

import com.example.batchprocessing.Repository.PersonRepository;
import com.example.batchprocessing.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService implements CommandLineRunner {

    //@Autowired
    private PersonRepository personRepository=new PersonRepository();

    private static final Logger log=Logger.getLogger(PersonService.class.getName());


    public void run(String... args) {
        log.info("DBから情報を取り出します。");
        log.info("Start extract person info");


        List<Person> list = takePersonInfo();


        log.info("Finished extracting person info ");
        log.info("personの情報を表示します。");
        list.forEach(Person -> System.out.println(Person));
    }


    public List<Person> takePersonInfo() {
        List<Person> list = new ArrayList<>();
        try {
            list = personRepository.getAllPersonInfo();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
