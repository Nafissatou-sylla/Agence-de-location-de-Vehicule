package org.formation.sylla.rentacar;

import java.io.Serializable;

/**
 * Class client
 * @author finas
 *
 */

public class Client implements Serializable{
	private static final long serialVersionUID = 1L;
	private String lastName;
	private String firstName;
	private int bornYear;
	private Car car;
	
	
	/**
	 * 
	 * @param lastName client's lastName
	 * @param firstName client's firstName
	 * @param bornYear client's bornYear
	 */
	public Client(String lastName, String firstName, int bornYear) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.bornYear = bornYear;
		this.car = null;
	}

	
	public String getLastName() { return lastName; }

	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

	public String getFirstName() {
		return firstName;
	}
	

	public void setFirstName(String prénom) {
		this.firstName = prénom;
	}

	
	public int getBornYear() {
		return bornYear;
	}

	
	public void setBornYear(int bornYear) {
		this.bornYear = bornYear;
	}
	
	
	/**
	 * 
	 * @param car the car for rent
	 */
	public void rentACar(Car car) {
		this.car = car;
	}
	
	
	/**
	 * the client starts the car
	 * @throws driveException 
	 */
	public void driveCar(Car car) throws driveException {
		if(car == null) {
			throw new driveException(car);
		}
		else {
			car.launchMotor();
		}
	}
	
	
	/**
	 * le client retourne la voiture
	 * @param car la voiture retournée
	 * @return retourne la voiture
	 */
	public Car returnCar(Car car) {
		Car theCar = car;
		return theCar = null;
	}
}

