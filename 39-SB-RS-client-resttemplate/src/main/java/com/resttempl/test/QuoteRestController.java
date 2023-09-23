package com.resttempl.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteRestController {

	@Autowired
	private QouteClient qouteClient;
	
	@GetMapping(value = "/quote", produces= {"application/json"})
	public String getQoute() {
		
		String quote = qouteClient.invokedRandomQouteApi();
		System.out.println("qoute: "+quote);
		return quote;
	}
	
	@GetMapping(value = "/quotes", produces= {"application/json"})
	public String getQoute1() {
		System.out.println("In Quotes1");
		String qoute1 = qouteClient.invokeRandomApiGetObject();
		
		return qoute1;
	}
}
