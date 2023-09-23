package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//hit below urls
		//http://localhost:9090/actuator
		//http://localhost:9090/actuator/health
		
		
		//when shutdown is enabled it will stop our app after hitting the shutdowm url
		//http://localhost:9090/actuator/shutdown (you can get all endpoints here http://localhost:9090/actuator/shutdown)
		//since shutdown is binded to post request hit the endpoint in the postman=
		
		/*
		 * { "message": "Shutting down, bye..." }
		 */
	}

}
