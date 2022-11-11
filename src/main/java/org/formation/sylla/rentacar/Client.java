package org.formation.sylla.rentacar;

import java.io.Serializable;
import java.util.ArrayList;

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
	 * @param car the car that the client wants to rent
	 * @throws CarAlreadyRentedException exception if the car is already rented
	 * @throws CarNotInTheAgencyException exception if the car is not in the agency
	 * @throws ClientAlreadyRentedACarException exception if the client has already rented a car
	 */
	public void rentACar(Car car, ArrayList<Agency> agencies) throws CarAlreadyRentedException, CarNotInTheAgencyException, ClientAlreadyRentedACarException {
		for (Agency agency : agencies) {
			agency.giveCar(this, car);
			this.car = agency.getRentedCars().get(this) ;
		}
	}
	
	
	/**
	 * the client launch the motor
	 */
	public void launchMotor() {
		this.car.getMotor().toString();
	}
	
	
	/**
	 * the client starts the car
	 * @throws DriveException 
	 */
	public void driveCar() throws DriveException {
		if(this.car == null) {
			throw new DriveException(car);
		}
		else {
			try {
				this.car.startACar();
			} 
			catch (OilLevelException e) {
				e.printStackTrace();
			}
			launchMotor();
		}
	}
	
	
	/**
	 * the client returns the car 
	 * @return return the car
	 */
	public Car returnCar() {
		Car tmp = null;
		tmp = this.car;
		this.car = null;
		return tmp;
	}


	@Override
	public String toString() {
		return "Client " + lastName + " " + firstName  + " " + bornYear + " ans, car: " + car;
	}
	
	
	
}

