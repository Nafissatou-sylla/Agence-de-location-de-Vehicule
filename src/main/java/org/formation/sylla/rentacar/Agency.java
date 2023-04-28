package org.formation.sylla.rentacar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author finas
 * class agency to rent a car 
 */

public class Agency<Car>  extends Vehicle implements Serializable{
	private String name, address;
	private static final long serialVersionUID = 1L;
	private ArrayList<Client> listClients;
	private ArrayList<Car> listCars;
	private Map<Client , Car> rentedCars;


	/**
	 * 
	 * @param name the agency's name 
	 * @param address agency's address
	 */

	public Agency(String name, String address) {
		this.name = name;
		this.address = address;
		this.listClients = new ArrayList<>();
		this.listCars = new ArrayList<>();
		this.rentedCars = new HashMap<>();
	}


	/**
	 * 
	 * @param car agency's car
	 */
	public Agency(ArrayList<Car> cars) { this.listCars.addAll(cars); }


	
	
	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected String getAddress() {
		return address;
	}


	protected void setAddress(String address) {
		this.address = address;
	}


	public ArrayList<Car> getListCars() {
		return listCars;
	}
	
	public void setListCars(ArrayList<Car> listCars) {
		this.listCars = listCars;
	}

	public ArrayList<Client> getListClients() {
		return listClients;
	}

	
	/**
	 * 
	 * @return the list of each rented car and the client who rented it
	 */
	public Map<Client, Car> getRentedCars() {
		return rentedCars;
	}


	/**
	 * the Agency receive a new Client
	 * @param client the new client that must be enter to the agency
	 * @return true if we add the client
	 */
	public boolean addAClient(Client client) {
		if(listClients.contains(client)) {
			return false;
		}
		else {
			listClients.add(client);
			return true;
		}
	
	}
	
	
	/**
	 * the Agency receive a new Car
	 * @param car the new car of agency
	 * @return true if we add the car in the agency's car list
	 */
	public boolean addCar(Car car) {
		if(listCars.contains(car)) {
			return false;
		}
		else {
			listCars.add(car);
			return true;
		}
	}


	/**
	 * 
	 * @param client the client who wants to rent a car
	 * @return if the client has already rented a car
	 */
	public boolean clientHasAlreadyRentedACar(Client client) {
		return rentedCars.containsKey(client);
	}


	/**
	 * 
	 * @param car the car that the client wants to rent
	 * @return if the car is already rented
	 */
	public boolean carHasAlreadyRented(Car car) {
		return rentedCars.containsValue(car);
	}

	/**
	 * to associate the car with the client
	 * @param client the client who rented the car 
	 * @param car the car that we should give to the client
	 * @throws CarAlreadyRentedException exception if the car is already rented
	 * @throws CarNotInTheAgencyException exception if the car is not in the agency
	 * @throws ClientAlreadyRentedACarException  exception if the client has already rented a car
	 */

	public void giveCar(Client client, Car car) throws CarAlreadyRentedException, CarNotInTheAgencyException, ClientAlreadyRentedACarException {
		if( ! listClients.contains(client)) {
			listClients.add(client);
			}
		if( ! listCars.contains(car)) {
			throw new CarNotInTheAgencyException();
		}
		if( carHasAlreadyRented(car)){
			throw new CarAlreadyRentedException();
			}
		if(clientHasAlreadyRentedACar(client)) {
			throw new ClientAlreadyRentedACarException();
		}
		
		this.rentedCars.put(client , car);
	}
	
	
	/**
	 * checked if the client has returned the car 
	 * @param car 
	 */
	public void clientReturnedTheCar(Client client, Car car) {
		this.rentedCars.remove(client);
		this.listClients.remove(client);
		this.listCars.add(car);
	}


	@Override
	public String toString() {
		return " CarAgency " + this.getName() + ", address: " + this.getAddress() + ",\n listClients: " + listClients + ",\n listCars: "
				+ listCars + ",\n rentedCars: " + rentedCars;
	}
	
	
	
}

