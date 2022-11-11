package org.formation.sylla.rentacar;

public class CarNotInTheAgencyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarNotInTheAgencyException() {
		this("la voiture n'est pas dans l'agence");
	}

	public CarNotInTheAgencyException(String message) {
		super(message);
	}


}
