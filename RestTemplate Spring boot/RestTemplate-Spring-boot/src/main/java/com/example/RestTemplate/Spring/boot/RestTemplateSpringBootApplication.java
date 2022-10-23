package com.example.RestTemplate.Spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RestTemplateSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateSpringBootApplication.class, args);
	}

}
