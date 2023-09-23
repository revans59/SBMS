package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.PassengerRequest;
import com.example.demo.response.TicketResponse;

@RestController
public class IrctcRestController {

	@PostMapping(
			value = "/bookticket", 
			produces= {"application/xml", "application/json"},
			consumes= {"application/xml", "application/json"}
			)
	public TicketResponse bookTicket(@RequestBody PassengerRequest req) {
	
		//logic to book ticket
		
		TicketResponse ticketResponse = new TicketResponse();
		ticketResponse.setStatus("Confirmed");
		ticketResponse.setPrice("4534.00");
		BeanUtils.copyProperties(req, ticketResponse);
		return ticketResponse;
	}
	
}
