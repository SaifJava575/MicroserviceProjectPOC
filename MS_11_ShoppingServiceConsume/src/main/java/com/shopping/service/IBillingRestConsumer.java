package com.shopping.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billing-Service")
public interface IBillingRestConsumer {
	
	@GetMapping("/billing/info")
	public String getBillingInfo();

}
