package com.swagex.apps.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwggerWithRestContoller {

	@GetMapping("/user/{userId}")
	public String getUser(@RequestBody Integer userId) {
	
		if(userId == 100)
		{
			return "Revan";
		}else if(userId == 200) {
			return "Siddu";
		}
		else
			return "No User Found";
	}
}
