package com.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Ms11CentralizeDistributedTracingLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms11CentralizeDistributedTracingLoggingApplication.class, args);
	}

}
