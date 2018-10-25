package com.demo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstSampleController {
	
	@GetMapping("/sayHello/{name}")
	private String sayHello(@PathVariable String name) {
		return "Hello " + name;
	}

}
