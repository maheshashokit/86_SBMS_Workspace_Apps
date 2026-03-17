package com.ashokit.spring.beans;

public class Demo {

	//Field
	private String message;
	
	//setter method
	public void setMessage(String message) {
		System.out.println("Inside the Setter Method");
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		System.out.println("Inside the toString()...........");
		return "Demo [message=" + message + "]";
	}
}