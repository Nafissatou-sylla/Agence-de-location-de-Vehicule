package org.formation.sylla.rentacar;

public class OilLevelException extends Exception {

	public OilLevelException() {
		this("le niveau d'huile est anormal");
	}

	public OilLevelException(String message) {
		super(message);
	}

}
