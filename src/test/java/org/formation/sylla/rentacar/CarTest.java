package org.formation.sylla.rentacar;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {
	private Car car;
	private Motor motor;
	private String mark;
	
	@BeforeEach
	void initialisingCar() {
		car = new Car();
		motor = new Motor();
		mark = "BMW";
		
	}

	@Test
	void testOpenCowl() {
		car = new Car( mark, motor);
		assertEquals(car.openCowl(), motor);
	}

	
	@Test
	void testStartCar() throws OilLevelException {
		assertThrows(OilLevelException.class,()->{car.startACar();});
	}
}

