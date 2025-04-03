package com.example.cv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CvApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvApplication.class, args);
	}

}

//mvn spring-boot:run  -app

//mvn clean install    -maven

//rm -rf target
//mvn clean package    -target

//./mvnw clean package  -gera o jar

/// gerar xml no postman com os endpoints
