package com.example.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

//中間処理を行うクラス
public class PersonItemProcessor implements ItemProcessor<Person,Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception{
        final String firstName = person.getFirstName().toUpperCase();//firstNameを大文字に変換
        final String lastName = person.getLastName().toUpperCase();  //lastNameを大文字に変換

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Converting(" + person +") into (" + transformedPerson + ")");

        return transformedPerson;
    }
}
