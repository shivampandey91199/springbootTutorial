package com.Shivam.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Book")
public class HelthCheckController {

	
	
	@GetMapping("/Helth-Check")
	 public String HelthCheck() {
		 return "ok";
	 }
	
	
	
}
