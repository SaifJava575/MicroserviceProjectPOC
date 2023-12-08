package com.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJms
public class Ms05ActiveMqProducerPtpApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms05ActiveMqProducerPtpApplication.class, args);
	}

}
