package org.formation.sylla.rentacar;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {
	private Car car;
	Motor motor;
	
	@BeforeEach
	void initialisingCar() {
		car = new Car();
		motor = new Motor();
	}

	@Test
	void testOpenCowl() {
		car = new Car(motor);
		assertEquals(car.openCowl(), motor);
	}

}

