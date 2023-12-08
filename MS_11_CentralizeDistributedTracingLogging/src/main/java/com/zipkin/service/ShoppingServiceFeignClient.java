package com.zipkin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Shopping-Service")
public interface ShoppingServiceFeignClient {

	@GetMapping("/shopping/info-feign")
	public String displayShoppingDetailsUsingOpenFignClient();
}
