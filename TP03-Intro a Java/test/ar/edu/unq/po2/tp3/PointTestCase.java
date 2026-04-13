package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	
	//Defino la variable Point que utilizare
		private Point aPointWithoutArg; // <- un punto instanciado sin pasarle argumentos al constructor
		private Point aPointWithArg;	// <- un punto instanciado pasandole argumentos al constructor
			
			@BeforeEach
			public void setUp() throws Exception {
				
			// Inizializando las variables
				aPointWithoutArg = new Point();
				aPointWithArg = new Point(2,3);				
			}
			
			@Test
			void testMoverPunto() {
				
				// Compruebo que el punto se encuentre en (2,3)
				assertTrue(aPointWithArg.getX() == 2); assertTrue(aPointWithArg.getY() == 3);
				
				// Lo Muevo hacia una nueva posicion
				aPointWithArg.mover(154, -74);
				
				//Compruebo que se encuentre en la nueva posicion
				assertTrue(aPointWithArg.getX() == 154); assertTrue(aPointWithArg.getY() == -74);
				
			}
			
			@Test
			void testSumarPuntos() {
					
					//Coloco los valores que espero encontrar del punto
					int valorEsperadoEnX = 2;
					int valorEsperadoEnY = 3;
					
					// Consigo un nuevo punto sumando al Point (0,0) y al Point (2,3)
					Point puntoEsperado = aPointWithoutArg.sumarCon(aPointWithArg);
					
					assertEquals(valorEsperadoEnX, puntoEsperado.getX());
					assertEquals(valorEsperadoEnY, puntoEsperado.getY());
			}
}
