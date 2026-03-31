package com.Aadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminServerMicroservices5Application {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerMicroservices5Application.class, args);
	}

}
