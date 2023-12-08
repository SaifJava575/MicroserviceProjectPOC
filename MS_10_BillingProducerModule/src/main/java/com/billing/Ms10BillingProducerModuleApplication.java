package com.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms10BillingProducerModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms10BillingProducerModuleApplication.class, args);
	}

}
