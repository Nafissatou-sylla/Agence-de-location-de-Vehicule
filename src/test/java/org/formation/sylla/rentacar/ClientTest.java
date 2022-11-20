package org.formation.sylla.rentacar;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {
	
	private Client client;
	private Agency<Car> agency;
	private Car car;
	
	@BeforeEach
	void initialisingClient() {
		client = new Client("SYLLA", "Nafissatou", 2000);
		agency = new Agency<>("Agence", "Marseille");
		car =new Car("BMW", new Motor());
		agency.addCar(car);
	}
	
	@Test
	void testGetLastName() {
		assertThat(client.getLastName()).isEqualTo("SYLLA");
	}
	
	@Test
	void testGetFirstName() {
		assertEquals(client.getLastName(),"SYLLA");
	}
	
	@Test
	void testGetBornYear() {
		assertEquals(client.getBornYear(),2000);
	}
	
	@Test
	void testRentACar() throws CarAlreadyRentedException, CarNotInTheAgencyException, ClientAlreadyRentedACarException {
		client.rentACar(car, agency);
	}
	
	@Test
	void testRentACarWithSpecificMark() throws CarAlreadyRentedException, CarNotInTheAgencyException, ClientAlreadyRentedACarException, MarkException {
		assertDoesNotThrow(()->{client.rentACarWithSpecificMark(car, agency, "BMW");});
		assertThrows(MarkException.class,()->{client.rentACarWithSpecificMark(car, agency, "Mercedes");});

	}
	
	@Test
	void testReturnCar() {
		Car car = new Car();
		assertEquals(client.returnCar(car), null);
	}

	
	@Test
	void testDriveCar() throws DriveException {
		assertThrows(DriveException.class,()->{client.driveCar();});	}
}
