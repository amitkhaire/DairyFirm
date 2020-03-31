package com.shubhamdairy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.shubhamdairy.repository")
//@ComponentScan(basePackages = "com.shubhamdairy")
public class ShubhamDairyFirmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShubhamDairyFirmApplication.class, args);
		System.out.println("Hello This is spring boot application");
	}

}
