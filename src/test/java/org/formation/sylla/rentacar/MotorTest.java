package org.formation.sylla.rentacar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MotorTest {
	private Motor motor = new Motor(8);
	@Test
	void testGetOilLevel() {
		assertThat(motor.getOilLevel()).isEqualTo(8);
	}

}
