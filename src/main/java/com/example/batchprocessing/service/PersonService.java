package com.example.batchprocessing.service;

import com.example.batchprocessing.person.Person;
import com.example.batchprocessing.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    private static final Logger log = Logger.getLogger(PersonService.class.getName());


    public void run(String... args) {

        log.info("Start extract person info");
        List<Person> list = takePersonInfo();
        log.info("Finished extracting person info ");

        log.info("display person info");
        list.forEach(Person -> System.out.println(Person));

        log.info("start output person info");
        writeCSVtoLocal(list);
        log.info("finish output person info");
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


    public void writeCSVtoLocal(List<Person> personList) {

        for (Person person : personList) {

            StringBuilder str = new StringBuilder();

            str.append(person.getFirstName() + "," + person.getLastName() + "," + person.getAddress());

            File file = new File("test.csv");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {

                bw.write(str.toString());
                bw.newLine();

            } catch (IOException e) {

                e.printStackTrace();

            }
        }
    }

}
