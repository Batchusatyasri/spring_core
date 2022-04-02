package com.springboot.workers.jdbcexample;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootorgjdbcApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootorgjdbcApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8084"));
        app.run(args);
	}

}
