package org.formation.sylla.rentacar;

/**
 * 
 * @author finas
 */

public class Cylinder {
	private int numDeCylindre;
	private String state;
	
	
	
	/**
	 * construct cylinders
	 */
	public Cylinder(int numCylindre, String state) {
		this.setNumCylindre ( numCylindre);
		this.setState(state);
	}


	public int getNumCylindre() {
		return numDeCylindre;
	}


	public void setNumCylindre(int numCylindre) {
		this.numDeCylindre = numCylindre;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return " cylindre numéro " + numDeCylindre + " démaré \n";
	}
	
	
	
}
