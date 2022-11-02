package org.formation.sylla.rentacar;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {
	
	private Client client;
	@BeforeEach
	void initialisingClient() {
		client = new Client("SYLLA", "Nafissatou", 2000);
	}
	
	@Test
	void testGetLastName() {
		assertEquals(client.getLastName(),"SYLLA");
	}
	
	@Test
	void testGetFirstName() {
		assertEquals(client.getLastName(),"SYLLA");
	}
	
	@Test
	void testGetBornYear() {
		assertEquals(client.getBornYear(),2000);
	}
//	
//	@Test
//	void testRentACar() {
//		Car car = new Car();
//		assertEquals(client.rentACar(car), car);
//	}
	
	@Test
	void testReturnCar() {
		Car car = new Car();
		assertEquals(client.returnCar(car), null);
	}

}
