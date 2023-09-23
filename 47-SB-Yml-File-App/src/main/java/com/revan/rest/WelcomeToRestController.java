package com.revan.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeToRestController {

	@Autowired
	private AppProperties appProperties;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		 Map<String, String> messages = appProperties.getMessages();
		 
		 String welcomeMsg = messages.get("welcomMsg");
		 System.out.println("test: "+welcomeMsg);
		return welcomeMsg;
	}
	
	
	@GetMapping("/greetings")
	public String greetingsMsg() {
		 Map<String, String> messages = appProperties.getMessages();
		 
		 String welcomeMsg = messages.get("greetings");
		 System.out.println("test: "+welcomeMsg);
		return welcomeMsg;
	}
	
	
}
