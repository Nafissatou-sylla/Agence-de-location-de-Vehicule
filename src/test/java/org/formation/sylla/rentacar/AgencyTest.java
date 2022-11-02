package org.formation.sylla.rentacar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgencyTest {
	private Agency agency;
	private Client client;
	private Car car;
	
	@BeforeEach
	void createAgence() {
		agency = new Agency("Agence de voiture", "Marseille");
		car = new Car();
		client = new Client("SYLLA", "Nafissatou", 2000);
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
	void testCreateCar() {
		agency = new Agency(car);
		assertEquals(agency.createCar(), car);
	}
	
	@Test
	void testAddAClient() {
		assertEquals(agency.addAClient(client), client);
	}
	
	@Test
	void testGiveACar() {
		
	}
}
