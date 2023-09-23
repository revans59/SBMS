package com.resttempl.test;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QouteClient {

	String body = "";

	public String invokedRandomQouteApi() {

		String apiUrl = "https://run.mocky.io/v3/93847e41-d5a8-40df-abeb-5e104f14a277";

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<String> respEntity = restTemplate.getForEntity(apiUrl, String.class);
		System.out.println("respEntity.getStatusCode(): " + respEntity.getStatusCode());
		int statusCode = respEntity.getStatusCodeValue();
		System.out.println("status code: "+statusCode);
		System.out.println("respEntity.getBody(): " + respEntity.getBody());
		if (statusCode==200) {
			body = respEntity.getBody();
			System.out.println("body in if" + body);

			return body;
		}
		System.out.println("body " + body);

		return null;

	}

	public String invokeRandomApiGetObject() {

		String apiUrl = "https://run.mocky.io/v3/93847e41-d5a8-40df-abeb-5e104f14a277";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<QuoteApiResponse> responseEntity = rt.getForEntity(apiUrl, QuoteApiResponse.class);
		int statusCode = responseEntity.getStatusCodeValue();
		if(statusCode==200) {
			QuoteApiResponse body = responseEntity.getBody();
			System.out.println("body: ______-------"+body);
			return body.getValue().getQuote().toUpperCase();
			
		
			
		}
		return null;
	}
}
