package com.banana.banana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.banana.banana.repository.ConsentFormRepository", "com.banana.banana" })
public class BananaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BananaApplication.class, args);
	}

}
