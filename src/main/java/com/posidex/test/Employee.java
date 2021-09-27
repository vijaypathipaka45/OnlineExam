package com.posidex.test;

public class Employee {

	private int id;
	private String name;
	private String country;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
