package org.formation.sylla.rentacar;

/**
 * @author finas
 * class agency to rent a car 
 */

public class Agency {
private String name;
private String address;
private Client client;
private Car car;



/**
 * 
 * @param name the agency's name 
 * @param address agency's adress
 */

public Agency(String name, String address) {
	this.name = name;
	this.address = address;
	this.client = null;
	this.car = new Car();
}



/**
 * 
 * @param car agency's car
 */
public Agency(Car car) { this.car = car; }


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

public Car createCar() { return car; }


/**
 * receive a new Client
 * @return the new client
 */
public Client addAClient(Client client) { return client; }


/**
 * to give the car to the client
 * @param client the client who rented the car 
 * @throws carException 
 */

public void giveCar(Client client) throws carException {
	if(this.car == null) {
		throw new carException(this.car);
	}
	else { this.addAClient(client).rentACar(car); }
}

}

