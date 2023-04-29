package com.example.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	
	@GetMapping("/get")
	public String basic() {
		return "basic";
	}
	
	@GetMapping("/ipl")
	public String basic2() {
		return "ipl";
	}
	
	

}
