package org.formation.sylla.rentacar;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author finas
 *
 */

public class Motor {
	private ArrayList<Cylinder> cylinders;
	private double oilLevel;
	


	public Motor() {
	}
	

	/**
	 * construct the motor's cylinders
	 */
	public Motor(double oilLevel) {
		this.cylinders = new ArrayList<>() ;
		
		for (int i = 0; i < 20; i++) {
			this.cylinders.add(new Cylinder( i + 1, "bon état"));
		}
		
		setOilLevel(oilLevel);
		
	}
	

	public double getOilLevel() {
		return oilLevel;
	}

	public void setOilLevel(double oilLevel) {
		this.oilLevel = oilLevel;
	}

	
	public String displayCylinder(){
		String display = " ";
		for (Cylinder cylinder : cylinders) {
			display = this.toString();
		}
		return display;
	}


	@Override
	public String toString() {
		return " cylinders: " + cylinders;
	}	
	
	
}

