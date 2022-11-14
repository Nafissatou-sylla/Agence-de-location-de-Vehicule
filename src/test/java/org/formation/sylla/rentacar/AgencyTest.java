package org.formation.sylla.rentacar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
class AgencyTest {
	private Agency<Car> agency;
	private Client client;
	private Car car;
	private ArrayList<Car> cars;
	
	@BeforeEach
	void createAgence() {
		agency = new Agency<>("Agence de voiture", "Marseille");
		client = new Client("SYLLA", "Nafissatou", 2000);
		car = new Car();
		cars = new ArrayList<>();
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
		assertTrue(agency.addAClient(client));
		assertFalse(agency.addAClient(client));
		}
	
	
	@Test
	void testAddCar() {
		assertTrue(agency.addCar(car));
		assertFalse(agency.addCar(car));
	}
	
	
	@Test
	void testClientHasAlreadyRentedACar() {
		assertFalse(agency.clientHasAlreadyRentedACar(client));
		
	}
	
	@Test
	void CarHasAlreadyRente() {
		assertFalse(agency.carHasAlreadyRented(car));
	}
	
	@Test
	void testGiveACar() throws CarAlreadyRentedException, CarNotInTheAgencyException, ClientAlreadyRentedACarException {
		cars.add(car);
		agency.giveCar(client, car);
	}
	
	
	@Test
	void testClientReturnedTheCar() throws CarAlreadyRentedException, CarNotInTheAgencyException, ClientAlreadyRentedACarException {
		agency.clientReturnedTheCar(client, car);
	}
}
