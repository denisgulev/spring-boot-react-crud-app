package com.denis.sb.react.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class HomeController {

	@GetMapping("/")
	String home() {
		log.info("home controller called");
		return "Home";
	}
	
}
