package com.activemq.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReciever {
	
	@JmsListener(destination = "testMQ1")
	public void readMessage(String text) {
		System.out.println(text);
	}
	
	@JmsListener(destination = "Obj1")
	public void recieveObjectInfo(ActorInfo actor) {
		System.out.println("object recieved data :"+actor);
	}

}
