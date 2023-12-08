package com.zipkin.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zipkin.service.BillingServiceConsumers;
import com.zipkin.service.ShoppingServiceFeignClient;

@RestController
@RequestMapping("/center")
public class CentralizedOperationController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private ShoppingServiceFeignClient shoppingServiceFeignClient;

	Logger logger = LoggerFactory.getLogger(CentralizedOperationController.class);
	@Autowired
	private BillingServiceConsumers billingServiceConsumers;

	@GetMapping("/operation")
	public String opearation() {
		logger.info("Execute the billing service");
		String msg = template.getForObject("http://localhost:9900/billing/info", String.class);
		logger.info("end the billing service process");
		logger.info(msg);
		return msg;
	}

	@GetMapping("/billing")
	public String billingServiceInfo() {
		return billingServiceConsumers.logicsoft();
	}
	
	@GetMapping("/shopping")
	public String shoppingServiceInfo() {
		return shoppingServiceFeignClient.displayShoppingDetailsUsingOpenFignClient();
	}

}
