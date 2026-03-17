package com.ashokit.spring.beans;

public class Address {

	private String doorNo;
	private String city;
	private String streetName;

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

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", city=" + city + ", streetName=" + streetName + "]";
	}
	
	//service method
    public String getAddressInfo() {
    	return String.format("DoorNo %S , StreetName %S, CityName %S", doorNo,streetName,city);
    }

}
