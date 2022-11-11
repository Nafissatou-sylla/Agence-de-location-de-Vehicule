package org.formation.sylla.rentacar;


/**
 * 
 * @author finas
 *
 */

public class CarAlreadyRentedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarAlreadyRentedException() {
		this("la voiture est déja louée");
	}

	public CarAlreadyRentedException(String message) {
		super(message);
	}
	
	
	

}

