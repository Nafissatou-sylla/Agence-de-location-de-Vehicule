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
	
	
	/**
	 * client can open the car's cowl
	 * @return the car's motor
	 */
	public Motor openCowl() {
		return motor;
	}
	
	/**
	 * the client launch the motor
	 */
	public void launchMotor() {
		motor.displayCylinders();
	}


	@Override
	public String toString() {
		return "Car [mark=" + mark + "]";
	}
	
	
}
