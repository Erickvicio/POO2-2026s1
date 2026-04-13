package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	//Creo la variable contenedora de un contador
	private Counter counter;
	
	/*
		Crea un escenario de test básico, que consiste en un contador
		con 10 enteros
	*/
	
	@BeforeEach
	public void setUp() throws Exception {
		
		// Se crea el contador
		counter = new Counter();
		
		// Se le agrega un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		
	}
	
	// Se verifica la cantidad de pares
	
	@Test
	void testEvenNumbers() {
		// Guardo la cantidad de numeros pares
			int cant = counter.getEvenOcurrences();
		
		// Compruebo que cant sea el valor esperado
			assertEquals(1, cant);
	}
	
	@Test
	void testOddOccurrences() {
		// Guardo la cantidad de numeros impares
			int cant = counter.getOddOcurrences();
				
		// Compruebo que cant sea el valor esperado
			assertEquals(9, cant);
	}
	
	@Test
	void testMultiplesOf() {
		// Guardo la cantidad de numeros multiplos de 3
			int cant = counter.getMultiplesOf(3);
				
		// Compruebo que cant sea el valor esperado
			assertEquals(2, cant);
	}

}
