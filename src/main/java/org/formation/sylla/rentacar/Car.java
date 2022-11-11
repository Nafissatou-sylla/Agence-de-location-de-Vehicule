package org.formation.sylla.rentacar;

/**
 * @author finas
 *
 */

public class Car {
	private Motor motor;
	private String mark;

/**
 * construct a motor
 */
	public Car() {
		this.motor = new Motor();
	}
	
	
	/**
	 * 
	 * @param motor the car's motor
	 */
	public Car(String mark, Motor motor) {
		this.motor = motor;
		this.mark = mark;
	}
	
	
	
	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public String getMark() {
		return mark;
	}


	public void setMark(String mark) {
		this.mark = mark;
	}


	/**
	 * client can open the car's cowl
	 * @return the car's motor
	 * @throws OilLevelException 
	 */
	public Motor openCowl(){
		return motor;
	}

	
	public void startACar()throws OilLevelException {
		if(this.motor.getOilLevel() <5 || this.motor.getOilLevel() >15 ) {
			throw new OilLevelException();
		}
	}

	@Override
	public String toString() {
		return "Car mark : " + mark ;
	}
	
	
}
