package org.formation.sylla.rentacar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgencyCamionTest {
	private AgencyCamion<Camion> agence;
	
	@BeforeEach
	void initAgencyCamion() {
		agence = new AgencyCamion<Camion>("Agence", "Paris");
	}

	@Test
	void testGetName() {
		assertThat(agence.getName()).isEqualTo("Agence");

	}
	
	@Test
	void testGetAddress() {
		assertThat(agence.getAddress()).isEqualTo("Paris");
	}

}
