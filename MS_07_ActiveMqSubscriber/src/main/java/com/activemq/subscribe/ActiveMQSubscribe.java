package com.activemq.subscribe;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQSubscribe {
	
	@JmsListener(destination = "pub1")
	public void subscribeMessage(String message) {
		System.out.println(message);
	}

}
