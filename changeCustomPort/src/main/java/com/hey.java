package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hey {

	
	@GetMapping("/")
	public String hi() {
		return "hey";
	}
}
