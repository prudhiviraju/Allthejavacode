package com.automation.coreJava.classesAndObjects;

/* This example shows how to implement classes concept*/
class Address {

	public String houseName;

	public String landMark;

	public String city;

	public String state;

	public String pinCode;

	public Address(String houseName, String landMark, String city, String state, String pincode) {
		this.houseName = houseName;
		this.landMark = landMark;
		this.city = city;
		this.state = state;
		this.pinCode = pincode;
	}

	public void display() {
		System.out.print("HouseName:" + houseName + "\t");
		System.out.print("LandMark:" + landMark + "\t");
		System.out.print("City:" + city + "\t");
		System.out.print("State:" + state + "\t");
		System.out.println("PinCode:" + pinCode + "\t");
	}

	public static void display(Address address) {
		System.out.print("HouseName:" + address.houseName + "\t");
		System.out.print("LandMark:" + address.landMark + "\t");
		System.out.print("City:" + address.city + "\t");
		System.out.print("State:" + address.state + "\t");
		System.out.println("PinCode:" + address.pinCode + "\t");
	}

}
