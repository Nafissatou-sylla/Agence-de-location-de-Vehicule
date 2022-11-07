package org.formation.sylla.rentacar;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author finas
 * class agency to rent a car 
 */

public class Agency {
private String name;
private String address;
private ArrayList<Client> clients;
private ArrayList<Car> cars;


/**
 * 
 * @param name the agency's name 
 * @param address agency's adress
 */

public Agency(String name, String address) {
	this.name = name;
	this.address = address; 
	this.clients = null;
	this.cars = new ArrayList<>();
	
	for (Client client : clients) {
		client = null;
	}
}



/**
 * 
 * @param car agency's car
 */
public Agency(ArrayList<Car> cars) { this.cars = cars; }


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


/**
 * Create a car
 * @return a car
 */

public Car createCar() {
	for (Car car : cars) {
		if(car == null) {
			cars.add(new Car());
		}
	}
	return new Car(); 
}


/**
 * the Agency receive a new Client
 * @return the new client
 */
public void addAClient(Client aClient) {
	for (Client client : clients) {
		if(client == null) {
			client = aClient;
		}
		else {
			System.out.println("le client existe déja");
		}
	}
}



/**
 * to give the car to the client
 * @param client the client who rented the car 
 * @throws carException 
 */

public void giveCar(Client client) throws carException {
	if(this.cars == null) {
		//throw new carException();
	}
	//else { this.addAClient(client).rentACar(car); }
}

}

