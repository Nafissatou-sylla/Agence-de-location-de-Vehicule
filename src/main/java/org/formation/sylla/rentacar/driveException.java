package org.formation.sylla.rentacar;

public class driveException extends Exception{
	private Car car;

	public driveException(Car car) {
		this.car = car;
	}
	
	
	/**
	 * Returns the detail message string of this throwable.
	 */
	@Override
	public String getMessage() {
		return car.toString() + " démarrage impossible,vous n'avez pas de voiture";
	}
}
