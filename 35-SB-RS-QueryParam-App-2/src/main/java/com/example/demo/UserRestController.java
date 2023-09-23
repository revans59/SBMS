package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	//Dispatcher will come to know that the restController method has User as parameter with @Requestzbody
	//DS will hand over post req to handler mapper and handler mapper decides which rest ocontroller methods need to 
	//process the req and MsgConverter converts the incoming json(through @RequesBody) to java object 
	//after processing the java objectby the rest controller method the processed java object sent to DB-> MsgConverted converts to Json and returns the json to clients
	
	//Once the method 
	
	//http://localhost:8080/saveUser
	//set content-type= application/json  -> represent in which format client is sending data to server
//	{----> add below below payload in the req body of postman
//    "id" : 1234,
//    "fname" : "Revan",
//    "lname" : "Revani",
//    "email" : "siddurevan7@gmail.com"
//}
	
	//accept header indicates in which format the client is accepting the data from the resource
	//content-type header indicates in which format client is sending (in the req body) the data to resource
	@PostMapping(value = "/saveUser",
			consumes={"application/json", "application/xml"},
			produces= {"application/text"})// consumer indicates in which format the restController accept the data from the client (here rest method accept json or xml )
	public String addUser(@RequestBody User user) {
		
		System.out.println(user);
		
		String msg = "User saved successfully..!!";
		
		return msg;
	}
}
