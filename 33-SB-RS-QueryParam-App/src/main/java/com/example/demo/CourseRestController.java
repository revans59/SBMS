package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	//when the client/user hit the url the dispatcher servlet forward the requst to restcontroller with the paramaters
	//here cname is the query parameter(generally after ? at the end of url)
	
	@GetMapping(value="/course")
	public String getCourseDetails(@RequestParam("name") String name) {
		
		//http://localhost:8080/course?name=SBMS

		String msg = "";
		if("SBMS".equals(name)) {
			msg = "New Batch for SBMS from 15-jul-2021";
		}else if("JRTP".equals(name)) {
			
			msg = "New Batch for JRTP from 21-jul-2021";

		}else if("AWS".equals(name)) {
			msg = "New Batch for AWS from 23-jul-2021";

		}
		
		return msg = "Please visit the website";
	}
	
	@GetMapping("/fee")
	public String getFee(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {
		
		//http://localhost:8080/fee?cname=Ashok&tname=SBMS
		
		String str = cname +" by "+ tname + " is 5000 INR only";
		
		return str;
	}
}
