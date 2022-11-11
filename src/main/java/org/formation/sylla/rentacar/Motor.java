package org.formation.sylla.rentacar;

import java.util.ArrayList;

/**
 * 
 * @author finas
 *
 */

public class Motor {
	private ArrayList<Cylinder> cylinders;
	private double oilLevel;
	
	
	public Motor() {
		this.setOilLevel(12);
	}
	

	/**
	 * construct the motor's cylinders
	 */
	public Motor(double oilLevel) {
		this.cylinders = new ArrayList<>();
		setOilLevel(oilLevel);
		
	}
	

	public double getOilLevel() {
		return oilLevel;
	}

	public void setOilLevel(double oilLevel) {
		this.oilLevel = oilLevel;
	}
	
	/**
	 *  display each cylinder number when the client launch the car 
	 */
	public String displayCylinders() {
		String display = " ";
		for (Cylinder cylinder : cylinders) {
			display = cylinder.toString();
		}
		return display;
	}
	
	
}

