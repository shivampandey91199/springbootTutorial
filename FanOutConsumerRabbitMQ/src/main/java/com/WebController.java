package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@Autowired
	Publiser publiser;

	@PostMapping("/send")
	public String sendMsg(@RequestParam("msg") String msg) {
		publiser.produceMsg(msg);
		return "Done";
	}
}
