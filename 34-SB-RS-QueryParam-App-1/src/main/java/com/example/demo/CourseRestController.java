package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

				    //
	@GetMapping("/course/{cname}/trainer/{tname}")
	public String getCourseDetails(@PathVariable String cname, @PathVariable String tname) {
		
		String msg = cname + " By " +  tname + " starting from 15-jul-2023";
		
		return msg;
	}
}
