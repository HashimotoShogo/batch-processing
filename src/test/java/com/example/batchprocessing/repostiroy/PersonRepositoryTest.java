package com.example.batchprocessing.repostiroy;

import com.example.batchprocessing.person.Person;
import com.example.batchprocessing.repository.PersonRepository;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


@SpringBootTest
public class PersonRepositoryTest {


    private PersonRepository personRepository = new PersonRepository();


    @Test
    public void test_getAllPerson() {
        try {
            List<Person> list = personRepository.getAllPersonInfo();

            assertEquals("Jill", list.get(0).getFirstName());
            assertEquals("Doe", list.get(0).getLastName());
            assertEquals("Jill_house", list.get(0).getAddress());

            assertEquals("Joe", list.get(1).getFirstName());
            assertEquals("Doe", list.get(1).getLastName());
            assertEquals("Joe_house", list.get(1).getAddress());

            assertEquals("Justin", list.get(2).getFirstName());
            assertEquals("Doe", list.get(2).getLastName());
            assertEquals("justin_home", list.get(2).getAddress());

            assertEquals("Jane", list.get(3).getFirstName());
            assertEquals("Doe", list.get(3).getLastName());
            assertEquals("jane_house", list.get(3).getAddress());

            assertEquals("John", list.get(4).getFirstName());
            assertEquals("Doe", list.get(4).getLastName());
            assertEquals("John_house", list.get(4).getAddress());

        } catch (SQLException e) {
            e.printStackTrace();
            fail();
        }
    }


}
