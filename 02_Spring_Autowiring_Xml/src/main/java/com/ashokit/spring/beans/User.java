package com.ashokit.spring.beans;

public class User {

	private String username;
	private String password;	
	private Address address;
		
	public User(String username, String password, Address address) {
		//Parameterized Constructor..
		System.out.println("Parameterized Constructor......");
		this.username = username;
		this.password = password;
		this.address = address;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", address=" + address + "]";
	}
}
