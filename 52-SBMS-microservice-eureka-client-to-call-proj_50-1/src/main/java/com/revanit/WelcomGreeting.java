package com.revanit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomGreeting {

	@GetMapping("/greet")
	public String welcome() {
		
		return "Greetigs to Ashok IT";
		
		//Run the app-50 and hit first url-> run app51 refreh the url , run app52 refresh the url -> now hit the last two urls
		//http://localhost:9090
		//http://desktop-umckmnm:2222/greet
		//http://desktop-umckmnm:1111/welcome
	}

}
