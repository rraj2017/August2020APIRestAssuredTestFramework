package com.qa.api.gorest.pojo;

public class Address {
	private String flatNo;
	private String tower;
	private String avenue;
	private String society;
	private String city;
	private String state;
	private String pin;
	
	

	public Address(String flatNo, String tower, String avenue, String society, String city, String state, String pin) {
		this.flatNo = flatNo;
		this.tower = tower;
		this.avenue = avenue;
		this.society = society;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public String getFlatNo() {
	return flatNo;
	}

	public void setFlatNo(String flatNo) {
	this.flatNo = flatNo;
	}

	public String getTower() {
	return tower;
	}

	public void setTower(String tower) {
	this.tower = tower;
	}

	public String getAvenue() {
	return avenue;
	}

	public void setAvenue(String avenue) {
	this.avenue = avenue;
	}

	public String getSociety() {
	return society;
	}

	public void setSociety(String society) {
	this.society = society;
	}

	public String getCity() {
	return city;
	}

	public void setCity(String city) {
	this.city = city;
	}

	public String getState() {
	return state;
	}

	public void setState(String state) {
	this.state = state;
	}

	public String getPin() {
	return pin;
	}

	public void setPin(String pin) {
	this.pin = pin;
	}

}
