package org.formation.sylla.rentacar;


/**
 * 
 * @author finas
 *
 */

public class carException extends Exception{
	private Car car;

	public carException(Car car) {
		this.car = car;
	}
	
	
	/**
	 * Returns the detail message string of this throwable.
	 */
	@Override
	public String getMessage() {
		return car.toString() + " la voiture est déjà louée";
	}

}

