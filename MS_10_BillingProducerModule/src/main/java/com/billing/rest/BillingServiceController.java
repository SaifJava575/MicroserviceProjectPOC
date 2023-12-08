package com.billing.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/billing")
@RefreshScope
public class BillingServiceController {
	
	Logger logger = LoggerFactory.getLogger(BillingServiceController.class);

	
	@Value("${server.port}")
	private int port;
	@Value("${random.value}")
	private String instance;

	@Value("${message}")
	private String msg;

	@GetMapping("/info")
	public String getBillingInfo() {
		return "Here we have accpeted Net Banking,credit Card,Paytm,Phone pay methods ::port " + port + " instance :"
				+ instance;
	}

	@GetMapping("/logicsoft")
	public String logicsoft() {
		return "Hellow Logicsoft Company";
	}

	@GetMapping("/config")
	public String message() {
		logger.info("fetch the value form git lab configaration file");
		return this.msg;
	}

}
