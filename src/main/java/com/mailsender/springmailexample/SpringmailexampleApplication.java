package com.mailsender.springmailexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringmailexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmailexampleApplication.class, args);
		//newline added
	}

}
