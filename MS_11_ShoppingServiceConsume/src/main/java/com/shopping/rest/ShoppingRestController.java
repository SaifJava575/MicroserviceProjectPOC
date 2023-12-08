package com.shopping.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.bean.BillingServiceRestConsumer;
import com.shopping.service.IBillingRestConsumer;

@RestController
@RequestMapping("/shopping")
public class ShoppingRestController {
	
	Logger logger = LoggerFactory.getLogger(ShoppingRestController.class);


	@Autowired
	private BillingServiceRestConsumer consumer;

	@Autowired
	private IBillingRestConsumer iBillingRestConsumer;

	@GetMapping("/info")
	public String displayShoppingDetails() {
		return "Dussera festival for family shopping" + consumer.getBillingInfo();
	}

	@GetMapping("/info-load")
	public String displayShoppingDetailsUsingLoadClientBalanced() {
		return "Dussera festival for family shopping" + consumer.getBillingInfoLoadBalancer();
	}
	
	@GetMapping("/info-feign")
	public String displayShoppingDetailsUsingOpenFignClient() {
		logger.info("retrive the value from billing service registry ");
		return "Dussera festival for family shopping" + iBillingRestConsumer.getBillingInfo();
	}

}
