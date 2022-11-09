package org.formation.sylla.rentacar;


/**
 * 
 * @author finas
 *
 */

public class CarAlreadyRentedException extends Exception{

	public CarAlreadyRentedException() {
		this("la voiture est déja louée");
	}

	public CarAlreadyRentedException(String message) {
		super(message);
	}
	
	
	

}

