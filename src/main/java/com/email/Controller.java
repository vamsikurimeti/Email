package com.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	Service service;
	
	@GetMapping("/send")
		public String sendEmail(@RequestBody Email email) {
			return service.sendEmail(email);
			
		}
	}
