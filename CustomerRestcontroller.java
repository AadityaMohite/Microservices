package com.Aadi.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Aadi.Customer;
import com.Aadi.OrederClient;


@RestController

public class CustomerRestcontroller {
    @Autowired
	OrederClient orderclient;
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Map<String, Object>> getcustomerbyid(@PathVariable Integer id) {
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		
		
	                  Map<String,Object> map2     =         orderclient.getOrderbyid(id);
		
		
		map.put("ID: ", id);
		map.put("Name", "Aaditya");
		map.put("Address: ", "Pune");
		map.put("MobileNo:", 7738574060L);
		map.put("Email:", "mohiteaadi10@gmail.com");
		map.put("Order", map2);
		
		return new  ResponseEntity<Map<String, Object>>(map,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/customer2/{id}")
	public ResponseEntity<Customer> getcustomerbyid2(@PathVariable Integer id) {
		
		Customer coutomer = new Customer(102,"Raj","Mumbai",9324320826L,"aadityaym23hcome@student.mes.ac.in");
		
		
		
		
		return new  ResponseEntity<Customer>(coutomer,HttpStatus.OK);
		
		
	}
	
	
}
