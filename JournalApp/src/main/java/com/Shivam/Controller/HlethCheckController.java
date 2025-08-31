package com.Shivam.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HlethCheckController {

	@GetMapping("/Helth-check")
	public String helthCheck() {
		return "ok";
	}

}
