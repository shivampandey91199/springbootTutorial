package com.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Model.user;

@RestController
public class ModelController {

	@GetMapping("/")
	public String hey() {
		return "hey";
	}

	@GetMapping("/hey/{id}/{name}")
	public user getPathVeriable(@PathVariable("id") int id, @PathVariable("name") String name) {
		return new user(id, name);
	}

}
