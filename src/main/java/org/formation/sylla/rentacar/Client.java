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
	private ArrayList<Agency> agencies;
	

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
		this.agencies = new ArrayList<>();
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
	
	
	
	public ArrayList<Agency> getAgencies() {
		return agencies;
	}


	public void setAgencies(ArrayList<Agency> agencies) {
		this.agencies = agencies;
	}


	/**
	 * 
	 * @param car the car that the client wants to rent
	 * @throws CarAlreadyRentedException exception if the car is already rented
	 * @throws CarNotInTheAgencyException exception if the car is not in the agency
	 * @throws ClientAlreadyRentedACarException exception if the client has already rented a car
	 */
	public void rentACar(Car car, Agency<Car> agency) throws CarAlreadyRentedException, CarNotInTheAgencyException, ClientAlreadyRentedACarException {
			agency.giveCar(this, car);
			this.car = agency.getRentedCars().get(this) ;
	}
	
	
	public Car getCar() {
		return car;
	}

	
	
	/**
	 * the client launch the motor
	 */
	public void launchMotor() {
		System.out.println(this.car.getMotor().displayCylinder());
	}
	
	
	/**
	 * the client starts the car
	 * @throws DriveException 
	 */
	public void driveCar() throws DriveException {
		if(this.car == null) {
			throw new DriveException();
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
	public Car returnCar(Car car) {
		car = null;
		car = this.car;
		this.car = null;
		return car;
	}


	@Override
	public String toString() {
		return " Client " + firstName.toUpperCase() + " " + lastName  + " " + bornYear + " ans, " + this.car ;
	}
	
	
	
}

