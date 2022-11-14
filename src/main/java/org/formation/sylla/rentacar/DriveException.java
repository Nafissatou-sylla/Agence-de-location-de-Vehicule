package org.formation.sylla.rentacar;

public class DriveException extends Exception{

	private static final long serialVersionUID = 1L;

	public DriveException() {
		this("vous ne pouvez pas conduire sans voiture");
	}
	
	public DriveException(String message) {
		super(message);
	}
}
