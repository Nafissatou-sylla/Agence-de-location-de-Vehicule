package org.formation.sylla.rentacar;

public class ClientAlreadyRentedACarException extends Exception {
	private Client client;

	public ClientAlreadyRentedACarException() {
		this("le client a déja loué une voiture");
	}

	public ClientAlreadyRentedACarException(String message) {
		super(message);
	}


}
