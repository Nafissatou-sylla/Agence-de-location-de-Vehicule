package org.formation.sylla.rentacar;

public class CarNotInTheAgencyException extends Exception {

	public CarNotInTheAgencyException() {
		this("la voiture n'est pas dans l'agence");
	}

	public CarNotInTheAgencyException(String message) {
		super(message);
	}


}
