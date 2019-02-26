package com.stackroute.movieeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MovieEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieEurekaServiceApplication.class, args);
	}
}
