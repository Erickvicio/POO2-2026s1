package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class MultiploTestCase {
	
	//Creo una variable  tipo Multiplo para poder llamar a las funciones de la consigna
		private Multiplo consigna3;
			
			@BeforeEach
			public void setUp() throws Exception {
				
				// Creo la instancia de donde voy a llamar los metodos de la consigna del ejercicio
				consigna3 = new Multiplo();
			}
			
			@Test
			void testMultiplosHasta1000() {
				// Guardo un numero con 2 multiplos de 0 a 100 en la ArrayList
					ArrayList<Integer> valorEsperado = new ArrayList<Integer>(); // <- [977,0]
					valorEsperado.add(997);
					valorEsperado.add(0);
					
					ArrayList<Integer> valorResultante = consigna3.multiplosHasta1000(997);
		
					assertEquals(valorEsperado, valorResultante);
			}
			
			@Test
			void testMultiploMayorComun() {
				
				int valorEsperado = 1000; 
				int valorResultante = consigna3.multiploMasAlto(100, 200);
					
				assertEquals(valorEsperado, valorResultante);
				
				valorEsperado = 996; 
				valorResultante = consigna3.multiploMasAlto(4, 6);
					
				assertEquals(valorEsperado, valorResultante);
				
				valorEsperado = 945; 
				valorResultante = consigna3.multiploMasAlto(9, 7);
					
				assertEquals(valorEsperado, valorResultante);

				valorEsperado = 884; 
				valorResultante = consigna3.multiploMasAlto(17, 13);
					
				assertEquals(valorEsperado, valorResultante);
			}
}
