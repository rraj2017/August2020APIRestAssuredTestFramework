package com.qa.api.gorest.pojo;

public class AssignmentPojo2 {
	
	private String firstName;
	private String lastName;
	private String id;
	private String branch;
	private String department;
	private Address address;
	
	

	public AssignmentPojo2(String firstName, String lastName, String id, String branch, String department,
			Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.branch = branch;
		this.department = department;
		this.address = address;
	}

	public String getFirstName() {
	return firstName;
	}

	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}

	public String getLastName() {
	return lastName;
	}

	public void setLastName(String lastName) {
	this.lastName = lastName;
	}

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public String getBranch() {
	return branch;
	}

	public void setBranch(String branch) {
	this.branch = branch;
	}

	public String getDepartment() {
	return department;
	}

	public void setDepartment(String department) {
	this.department = department;
	}

	public Address getAddress() {
	return address;
	}

	public void setAddress(Address address) {
	this.address = address;
	}

}
