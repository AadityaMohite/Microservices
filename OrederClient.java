package com.Aadi;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="http://localhost:9090",name = "OrderService-microservice-1")

public interface OrederClient {

	@GetMapping("/order/{id}")
	Map<String, Object> getOrderbyid(@PathVariable Integer id);
	
	
	
	
}
