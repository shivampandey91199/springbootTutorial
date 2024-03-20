package com.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dao.ResponseDao;
import com.model.Responsebean;
import com.model.user;

@RestController
public class ResponseController {

	@GetMapping("/")
	public Responsebean<ArrayList<user>> getAllUser() {
		return Responsebean.getData(ResponseDao.users, "Successfully get data", 200);
	}
}
