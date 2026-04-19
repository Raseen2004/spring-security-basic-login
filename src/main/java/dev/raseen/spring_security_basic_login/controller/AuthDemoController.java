package dev.raseen.spring_security_basic_login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthDemoController {
	
	@GetMapping("/public/hello")
	public String publicApi() {
		return "Public API - No Login Required";
	}
	
	@GetMapping("/private/hello")
	public String privateApi() {
		return "Private API - Login Required";
	}
}
