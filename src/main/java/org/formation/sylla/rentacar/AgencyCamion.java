package org.formation.sylla.rentacar;

public class AgencyCamion<Camion> {
	private String name,  address;
	
	public AgencyCamion(String name, String address){
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

	@Override
	public String toString() {
		return "AgencyCamion [name=" + name + ", address=" + address + "]";
	}
	
	
}
