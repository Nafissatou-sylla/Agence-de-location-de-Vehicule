package org.formation.sylla.rentacar;

import java.util.ArrayList;

/**
 * 
 * @author finas
 *
 */

public class Motor {
	private ArrayList<Cylinder> cylinders;
	
	
	/**
	 * construct the motor's cylinders
	 */
	public Motor() {
		this.cylinders = new ArrayList(12);
		
	}
	
	/**
	 *  display each cylinder number when the client launch the car 
	 */
	public String displayCylinders() {
		String display = " ";
		for( int i = 0 ; i <=  this.cylinders.size() ;i++) {
			display = "cylindre numéro : " + i + " démarrer";
		}
		return display;
	}
}

