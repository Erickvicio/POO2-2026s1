package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class MultioperadorTestCase {
	
	//Defino las variables Multioperador que usare para los test
		private Multioperador operador1;
		private Multioperador operador2;
		private Multioperador operador3;
			
			@BeforeEach
			public void setUp() throws Exception {
				
			// Inizializando los operadores
				
				operador1 = new Multioperador();
				operador2 = new Multioperador();
				operador3 = new Multioperador();
				
				
				//Multioperador 1
				operador1.add(10);
				operador1.add(5);
				operador1.add(4);
				operador1.add(2);
				operador1.add(1);
				operador1.add(3);
				//Multioperador 2
				operador2.add(8);
				operador2.add(6);
				operador2.add(2);
				operador2.add(5);
				operador2.add(1);
				operador2.add(2);
				//Multioperador 3
				operador3.add(7);
				operador3.add(3);
				operador3.add(2);
				operador3.add(4);
				operador3.add(1);
				operador3.add(2);
				operador3.add(1);
			}
			
			@Test
			void testSumarTodo() {
				
				
					int valorEsperado = 25;
					int valorResultante = operador1.sumarTodo();
		
					assertEquals(valorEsperado, valorResultante);

					valorEsperado = 24;
					valorResultante = operador2.sumarTodo();
		
					assertEquals(valorEsperado, valorResultante);
					
					valorEsperado = 20;
					valorResultante = operador3.sumarTodo();
		
					assertEquals(valorEsperado, valorResultante);
			}
			
			@Test
			void testRestarTodo() {
				
				
					int valorEsperado = -25;
					int valorResultante = operador1.restarTodo();
		
					assertEquals(valorEsperado, valorResultante);

					valorEsperado = -24;
					valorResultante = operador2.restarTodo();
		
					assertEquals(valorEsperado, valorResultante);
					
					valorEsperado = -20;
					valorResultante = operador3.restarTodo();
		
					assertEquals(valorEsperado, valorResultante);
			}
			
			@Test
			void testMultTodo() {
				
				
					int valorEsperado = 1200;
					int valorResultante = operador1.multTodo();
		
					assertEquals(valorEsperado, valorResultante);

					valorEsperado = 960;
					valorResultante = operador2.multTodo();
		
					assertEquals(valorEsperado, valorResultante);
					
					valorEsperado = 336;
					valorResultante = operador3.multTodo();
		
					assertEquals(valorEsperado, valorResultante);
			}
}
