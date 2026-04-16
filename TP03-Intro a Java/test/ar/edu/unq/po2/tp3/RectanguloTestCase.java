package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	
	private Rectangulo r1;
	private Rectangulo r2;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
	// Inizializando las variables
		r1 = new Rectangulo(200,400);// <- Rectangulo Vertical
		r2 = new Rectangulo(300,150);// <- Rectangulo Horizontal
	}
	
	@Test
	void getAreaTest() {
		
		int valorEsperadoR1 = 80000; // Area = Base x Altura
		int valorEsperadoR2 = 45000;
		
		int valorResultanteR1 = r1.getArea();
		int valorResultanteR2 = r2.getArea();
		
		assertEquals(valorEsperadoR1, valorResultanteR1);
		assertEquals(valorEsperadoR2, valorResultanteR2);
	}
	
	@Test
	void getPerimetro() {
		
		int valorEsperadoR1 = 1200; // P = 2 * (Base + Altura)
		int valorEsperadoR2 = 900;
		
		int valorResultanteR1 = r1.getPerimetro();
		int valorResultanteR2 = r2.getPerimetro();
		
		assertEquals(valorEsperadoR1, valorResultanteR1);
		assertEquals(valorEsperadoR2, valorResultanteR2);
	}
	
	@Test
	void getOrientacion() {
		
		//Caso Positivos
		assertTrue(r1.esVertical());
		assertTrue(r2.esHorizontal());
		
		//Caso Negativo
		assertFalse(r1.esHorizontal());
		assertFalse(r2.esVertical());
		
		
	}

}
