package org.formation.sylla.rentacar;

public class OilLevelException extends Exception {

	private static final long serialVersionUID = 1L;

	public OilLevelException() {
		this("le niveau d'huile est anormal");
	}

	public OilLevelException(String message) {
		super(message);
	}

}
