package org.formation.sylla.rentacar;

public class MarkException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarkException() {
		this("On n'a pas de voiture de cette marque");
	}
	
	public MarkException(String message) {
		super(message);
	}
}
