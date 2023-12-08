package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms02ApiGatwayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms02ApiGatwayServiceApplication.class, args);
	}

}
