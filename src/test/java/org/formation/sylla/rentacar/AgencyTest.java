package org.formation.sylla.rentacar;

import static org.assertj.core.api.Assertions.assertThat;
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
		cars.add(car);
		agency.addCar(car);
	}
	
	
	
	
	@Test
	void testGetName() {
		assertThat(agency.getName()).isEqualTo("Agence de voiture");

	}
	
	@Test
	void testGetAddress() {
		assertThat(agency.getAddress()).isEqualTo("Marseille");
	}
	
	@Test
	void testGetListCars(){
		assertThat(agency.getListCars()).isEqualTo(cars);
	}
	
	@Test
	void testAddAClient() {
		assertTrue(agency.addAClient(client));
		assertFalse(agency.addAClient(client));
		}
	
	
	@Test
	void testAddCar() {
		assertFalse(agency.addCar(car));
	}
	
	
	@Test
	void testClientHasAlreadyRentedACar() {
		assertFalse(agency.clientHasAlreadyRentedACar(client));
		
	}
	
	@Test
	void CarHasAlreadyRented() {
		assertFalse(agency.carHasAlreadyRented(car));
	}
	
	
	@Test
	void testGiveACar() throws CarAlreadyRentedException, CarNotInTheAgencyException, ClientAlreadyRentedACarException  {
		agency.giveCar(client, car);
		assertThrows(CarAlreadyRentedException.class,()->{agency.giveCar(client, car);});
	}
	
	
	@Test
	void testClientReturnedTheCar() throws CarAlreadyRentedException, CarNotInTheAgencyException, ClientAlreadyRentedACarException {
		agency.clientReturnedTheCar(client, car);
	}
}
