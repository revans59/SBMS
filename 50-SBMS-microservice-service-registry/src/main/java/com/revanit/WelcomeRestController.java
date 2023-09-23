package com.revanit;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	public String greeting() {
		
		return "Greetings to Revan";
	}
}
