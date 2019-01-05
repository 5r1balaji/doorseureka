package com.agam.doors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DoorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoorsApplication.class, args);
	}

}

