package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {

	private Cuadrado c1;
	private Cuadrado c2;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
	// Inizializando las variables
		c1 = new Cuadrado(350);
		c2 = new Cuadrado(450);
	}
	
	@Test
	void getAreaTest() {
		
		int valorEsperadoC1 = 122500; 
		int valorEsperadoC2 = 202500;
		
		int valorResultanteC1 = c1.getArea();
		int valorResultanteC2 = c2.getArea();
		
		assertEquals(valorEsperadoC1, valorResultanteC1);
		assertEquals(valorEsperadoC2, valorResultanteC2);
	}
	
	@Test
	void getPerimetro() {
		
		int valorEsperadoC1 = 1400;
		int valorEsperadoC2 = 1800;
		
		int valorResultanteC1 = c1.getPerimetro();
		int valorResultanteC2 = c2.getPerimetro();
		
		assertEquals(valorEsperadoC1, valorResultanteC1);
		assertEquals(valorEsperadoC2, valorResultanteC2);
	}
	
	@Test
	void getOrientacion() {
		
		//Caso Negativo
		assertFalse(c1.esHorizontal());
		assertFalse(c1.esVertical());
		
		assertFalse(c2.esHorizontal());
		assertFalse(c2.esVertical());
		
	}

}
