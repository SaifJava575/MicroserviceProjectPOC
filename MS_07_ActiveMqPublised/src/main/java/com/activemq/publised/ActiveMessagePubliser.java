package com.activemq.publised;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ActiveMessagePubliser {
	@Autowired
	private JmsTemplate template;
	
	public void sendMessage() {
		template.send("pub1", msg->msg.createTextMessage("I am a full stack developer "+new Date()));
	}

}
