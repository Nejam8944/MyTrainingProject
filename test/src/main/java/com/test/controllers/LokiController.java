package com.test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class LokiController {
	@GetMapping("/loki")
	public String getRequest() {
		return "I am Loki";
	}

}
