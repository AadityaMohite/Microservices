package com.Aadi.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Orderrestcontroller {

	
//	@Autowired
//	RestTemplate restTemplate;
//	
	
	
	
	
	@GetMapping("/order/{id}")
	public ResponseEntity<Map<String,Object>> getorderbyid(@PathVariable Integer id) {
		
		
//	Map   customer	 = restTemplate.getForObject("http://localhost:8080/customer/101",Map.class );
		
	
	Map<String,Object> map = new LinkedHashMap<String,Object>();
	
	map.put("Id:", 101);
	map.put("Name","Laptop");
	map.put("Price", 450000.0);
	map.put("Quantity:", 1);
	map.put("Deliveryaddress", "Mumbai");
//	map.put("Customer", customer);
//	
		
		return new  ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
		
		
	}
	
	
	
	
	
}
