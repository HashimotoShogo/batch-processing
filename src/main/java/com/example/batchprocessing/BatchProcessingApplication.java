package com.example.batchprocessing;

import com.example.batchprocessing.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource("classpath:application.properties.xml")
public class BatchProcessingApplication implements CommandLineRunner {

    @Autowired
    PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(BatchProcessingApplication.class, args);
    }

    @Override
    public void run(String... args) {

        personService.run("hogehoge");
<<<<<<< HEAD

=======
>>>>>>> 3d3457779d51cc0030aefe9722a434ee5d83c64e
    }
}
