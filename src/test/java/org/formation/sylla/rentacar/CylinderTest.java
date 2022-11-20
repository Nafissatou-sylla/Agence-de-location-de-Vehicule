package org.formation.sylla.rentacar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CylinderTest {
	private Cylinder cylinder;
	
	@BeforeEach
	void initialisingCylinder() {
		cylinder = new Cylinder(12, "normal");
	}
	
	@Test
	void testGetNumCylinder() {
		assertEquals(cylinder.getNumCylindre(), 12);
	}
	
	@Test
	void testGetState() {
		assertThat(cylinder.getState()).isEqualTo("normal");
	}

	@Test
	void testToString() {
	String cylinderString = " cylindre numéro " + 12 + " démaré \n";
    assertThat(cylinder.toString()).isEqualTo(cylinderString);
	}
}
