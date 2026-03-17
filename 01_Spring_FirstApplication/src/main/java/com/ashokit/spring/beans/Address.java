package com.ashokit.spring.beans;

public class Address {

	public String streetName;
	public String doorNo;
	public String city;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", doorNo=" + doorNo + ", city=" + city + "]";
	}
	
	//service method to display data
	public String displayAddressDetails() {
		return String.format("StreetName: %S, DoorNo: %S, CityName: %S",streetName,doorNo,city);
	}
}