package com.example.batchprocessing;

import com.example.batchprocessing.Service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application.properties.xml")
public class BatchProcessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonService.class, args);
	}

}
