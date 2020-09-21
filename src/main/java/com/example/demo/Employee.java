package com.example.demo;

public class Employee {

	private String firstName;
	private String lastName;
	private int years;
	
	public Employee() {}
	
	public Employee(String firstName, String lastName, int years) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.years = years;
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
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	
	
	//lombok
}
