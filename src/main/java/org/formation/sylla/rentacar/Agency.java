package org.formation.sylla.rentacar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author finas
 * class agency to rent a car 
 */

public class Agency {
	private String name;
	private String address;
	private ArrayList<Client> listClients;
	private ArrayList<Car> listCars;
	private Map<Client, Car> rentedCars;


/**
 * 
 * @param name the agency's name 
 * @param address agency's adress
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
	public Agency(ArrayList<Car> cars) { this.listCars = cars; }


/**
 * 
 * @return agency's name
 */

	public String getName() { return name; }


/**
 * 
 * @return agency's address
 */

	public String getAddress() { return address; }


	public ArrayList<Car> getListCars() {
		return listCars;
	}

	public ArrayList<Client> getListClients() {
		return listClients;
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
		if( ! listCars.contains(car)) {
			throw new CarNotInTheAgencyException();
		}
		else if( carHasAlreadyRented(car)){
			throw new CarAlreadyRentedException();
			}
		else if(clientHasAlreadyRentedACar(client)) {
			throw new ClientAlreadyRentedACarException();
			}
		else {
			this.rentedCars.put(client, car);
		}
	}
}

