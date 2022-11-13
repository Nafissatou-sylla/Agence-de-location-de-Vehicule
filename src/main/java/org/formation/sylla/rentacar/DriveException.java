package org.formation.sylla.rentacar;

public class DriveException extends Exception{

	public DriveException() {
		this("vous ne pouvez pas conduire sans voiture");
	}
	
	public DriveException(String message) {
		super(message);
	}
}
