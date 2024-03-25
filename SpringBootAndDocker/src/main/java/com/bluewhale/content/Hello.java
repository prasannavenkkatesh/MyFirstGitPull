package com.bluewhale.content;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/sayHello")
	public String sayHello() {
		
		return " Hello Form Spring Boot";
	}
	

}
