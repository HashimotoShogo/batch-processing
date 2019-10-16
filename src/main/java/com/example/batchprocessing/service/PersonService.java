package com.example.batchprocessing.Service;

import com.example.batchprocessing.Repository.PersonRepository;
import com.example.batchprocessing.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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

        log.info("取得した情報の出力を始めます。");

        writeCSVtoLocal(list);

        log.info("CSV出力が終了しました。");

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


    public void writeCSVtoLocal(List<Person> personList){

        for(Person person:personList){
            StringBuilder str = new StringBuilder();

            str.append(person.getFirstName()+","+person.getLastName()+","+person.getAddress());

            File file = new File("USER/デスクトップ/test.csv");
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){

                bw.write(str.toString());

            }catch(IOException e){
                e.printStackTrace();
            }

        }

    }
}
