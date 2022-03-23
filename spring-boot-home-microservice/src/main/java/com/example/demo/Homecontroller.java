package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Homecontroller {
	
	
	@Autowired
	 private RestTemplate RT;
	
	
	@GetMapping("/home")
	public String home() {
		
		String products = RT.getForObject("http://PRODUCTS-MICROSERVICES/products", String.class);
		return products;
		
		
	}
	

}
