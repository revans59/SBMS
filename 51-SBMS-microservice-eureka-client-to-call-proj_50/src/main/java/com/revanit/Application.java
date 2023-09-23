package com.revanit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {

	//run application 50 (which is server on the default port 8761)
	//then run application 51 (eureka client which will get registered autometically on the eureka server on default port 8761-app 50)
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
