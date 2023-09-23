package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties
public class TicketResponse {

	private String gender;

	private String doj;

	private String from;

	private String to;

	private String train;

	private String status;

	private String price;

	private String name;

	private String dob;
	
	public TicketResponse() {
		
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

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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

	@Override
	public String toString() {
		return "TicketResponse [gender=" + gender + ", doj=" + doj + ", from=" + from + ", to=" + to + ", train="
				+ train + ", status=" + status + ", price=" + price + ", name=" + name + ", dob=" + dob + "]";
	}
	
	

}
