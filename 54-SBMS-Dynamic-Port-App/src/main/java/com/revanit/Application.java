package com.revanit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//Navigate to Run as Run Configuration -> click on Arguments -> in VM arguments  add "-Dserver.port=1111
	//Then run the application and hit below URL:
	//http://localhost:2222/welcome
}
