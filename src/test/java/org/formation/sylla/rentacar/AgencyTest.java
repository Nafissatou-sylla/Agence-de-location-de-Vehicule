package org.formation.sylla.rentacar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgencyTest {
	private Agency agency;
	private Client client;
	private Car car;
	private ArrayList<Client> listClients;
	private Map<Client, Car> listRentedCars;
	private ArrayList<Car> listCars;
	
	@BeforeEach
	void createAgence() {
		agency = new Agency("Agence de voiture", "Marseille");
		client = new Client("SYLLA", "Nafissatou", 2000);
		car = new Car();
		listClients = new ArrayList<>();
		listRentedCars = new HashMap<>();
		listCars = new ArrayList<>();
	}
	
	
	@Test
	void testGetName() {
		assertEquals(agency.getName(), "Agence de voiture");
	}
	
	@Test
	void testGetAddress() {
		assertEquals(agency.getAddress(), "Marseille");
	}
	
	
	
	@Test
	void testAddAClient() {
		assertEquals(listClients.add(client), agency.addAClient(client));
	}
	
	@Test
	void testAddCar() {
		assertEquals(listCars.add(car), agency.addCar(car));
	}
	
	
	@Test
	void testClientHasAlreadyRentedACar() {
		assertFalse(listRentedCars.containsKey(client));
	}
	
	@Test
	void CarHasAlreadyRente() {
		assertFalse(listRentedCars.containsValue(car));
	}
	
	@Test
	void testGiveACar() throws CarAlreadyRentedException, CarNotInTheAgencyException, ClientAlreadyRentedACarException {
		agency.giveCar(client, car);
	}
	
	
	@Test
	void testClientReturnedTheCar() {
		agency.clientReturnedTheCar(client, car);
	}
}
