package org.formation.sylla.rentacar;

public class ClientAlreadyRentedACarException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClientAlreadyRentedACarException() {
		this("le client a déja loué une voiture");
	}

	public ClientAlreadyRentedACarException(String message) {
		super(message);
	}


}
