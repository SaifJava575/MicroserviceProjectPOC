package com.activemq.send;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageSend {
	@Autowired
	private JmsTemplate template;

	//@Scheduled(cron = "* * * ? * *")
	public void sendMessage() {
		template.send("testMQ1", sec -> sec.createTextMessage("Hellow Logicsoft welcome " + new Date()));
		template.send("testMQ2", sec -> sec.createTextMessage("Today is Staurday " + new Date()));

		System.out.println("Message Sent");
	}
	
	public void sendActorInfo() {
		ActorInfo actor=new ActorInfo(101, "SK SAIFUDDIN", "Burdwan,WB-713143");
		template.convertAndSend("Obj1",actor);
		System.out.println("Object have send ");
	}

}
