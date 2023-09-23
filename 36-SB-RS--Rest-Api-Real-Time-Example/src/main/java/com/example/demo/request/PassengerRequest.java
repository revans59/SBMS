package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties
public class PassengerRequest {

	private String name;

	private String from; 
	
	private String dob;

	private String gender;

	private String doj;

	private String to;

	private String train;
	
	public PassengerRequest() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrain() {
		return train;
	}

	public void setTrain(String train) {
		this.train = train;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@Override
	public String toString() {
		return "PassengerRequest [name=" + name + ", from=" + from + ", dob=" + dob + ", gender=" + gender + ", doj="
				+ doj + ", to=" + to + ", train=" + train + "]";
	}

	

}
