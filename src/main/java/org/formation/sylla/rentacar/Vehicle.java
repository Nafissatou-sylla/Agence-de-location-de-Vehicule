package org.formation.sylla.rentacar;

public abstract class Vehicle {

	private String name;
	private String address;
	
	public Vehicle() {
		
	}

	public Vehicle(String name, String address) {
		this.name = name;
		this.address = address;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
