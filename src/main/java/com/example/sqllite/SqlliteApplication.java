package com.example.sqllite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.sqllite")
public class SqlliteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlliteApplication.class, args);
	}

}
