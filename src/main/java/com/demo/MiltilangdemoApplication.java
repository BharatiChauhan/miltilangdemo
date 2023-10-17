package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiltilangdemoApplication {

	public static void main(String[] args)
	{

		SpringApplication.run(MiltilangdemoApplication.class, args);
	}

}


// url for Application :- http://localhost:8080/?lang=es(for Spanish)
// http://localhost:8080/?lang=en(for English)
