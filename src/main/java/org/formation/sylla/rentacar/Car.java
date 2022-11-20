package org.formation.sylla.rentacar;

/**
 * @author finas
 *
 */

public class Car extends Vehicle{
	public Car() {}
	
	public Car( String mark, Motor motor) {
		super( mark, motor);
	}


	/**
	 * client can open the car's cowl
	 * @return the car's motor
	 * @throws OilLevelException 
	 */
	public Motor openCowl(){
		return this.getMotor();
	}

	
	public void startACar()throws OilLevelException {
		if(this.getMotor().getOilLevel() <5 || this.getMotor().getOilLevel() >15 ) {
			throw new OilLevelException();
		}
	}

	@Override
	public String toString() {
		return " car mark : " + this.getMark() ;
	}
	
	
}
