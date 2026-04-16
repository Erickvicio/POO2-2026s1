package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	private Persona p1;
	private Persona p2;
	
	@BeforeEach
	public void setUp() throws Exception {
		
	p1 = new Persona("Erick","Familia Aquino", LocalDate.of(2001, 3, 3));
	p2 = new Persona("Miguelina", "Aquino", LocalDate.of(1977, 8, 24));
		
	}
	
	@Test
	void testEdad() {
		
		int edadEsperadaP1 = 25;
		int edadResultanteP1 = p1.getEdad();
		
		int edadEsperadaP2 = 48;
		int edadResultanteP2 = p2.getEdad();
		
		
		
		assertEquals(edadEsperadaP1, edadResultanteP1);
		assertEquals(edadEsperadaP2, edadResultanteP2);
	}
	
	@Test
	void testMenorQue() {
		//Caso True
		assertTrue(p1.menorQue(p2));
		
		//Caso False
		assertFalse(p2.menorQue(p1));
	}

}
