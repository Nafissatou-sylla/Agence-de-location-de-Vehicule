package org.formation.sylla.rentacar;

public abstract class Vehicle {
	private Motor motor;
	private String mark;
	
	public Vehicle() {
		this.motor = new Motor();
	}
	
	
	public Vehicle(String mark,Motor motor) {
		super();
		this.motor = motor;
		this.mark = mark;
	}

	
	protected Motor getMotor() {
		return motor;
	}

	protected void setMotor(Motor motor) {
		this.motor = motor;
	}

	protected String getMark() {
		return mark;
	}

	protected void setMark(String mark) {
		this.mark = mark;
	}


	
	
}
