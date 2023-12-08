package com.shopping.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {
	@Autowired
	private DiscoveryClient client;

	@Autowired
	private LoadBalancerClient loadbalancer;

	//Discovery Client Uses 
	public String getBillingInfo() {
		List<ServiceInstance> service = client.getInstances("Billing-Service");
		ServiceInstance si = service.get(0);
		String url = si.getUri() + "/billing/info";
		RestTemplate template = new RestTemplate();
		String resp = template.getForObject(url, String.class);
		return resp;

	}
	
	//Load BALANCER CLIENT
	public String getBillingInfoLoadBalancer() {
		ServiceInstance service = loadbalancer.choose("Billing-Service");
		String url = service.getUri() + "/billing/info";
		RestTemplate template = new RestTemplate();
		String resp = template.getForObject(url, String.class);
		return resp;

	}
	

}
