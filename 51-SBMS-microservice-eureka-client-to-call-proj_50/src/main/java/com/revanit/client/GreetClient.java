package com.revanit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "GREET-API")/// this is acting as a client to app-52(GREET-API)
public interface GreetClient {

	@GetMapping("/greet")
	public String invokeGreetApi();
}
