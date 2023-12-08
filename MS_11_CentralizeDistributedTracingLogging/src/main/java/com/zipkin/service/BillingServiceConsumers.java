package com.zipkin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billing-Service")
public interface BillingServiceConsumers {
 
	@GetMapping("/billing/logicsoft")
	public String logicsoft();
}
