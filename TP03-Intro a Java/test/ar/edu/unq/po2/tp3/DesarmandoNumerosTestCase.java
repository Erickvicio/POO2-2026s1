package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class DesarmandoNumerosTestCase {
	//Creo una variable "list" de tipo ArrayList de enteros
		private DesarmandoNumeros consigna2;
		private ArrayList<Integer> list;
		
		/*
			Crea un escenario de test básico, que consiste en
			una lista de 10 numeros con su respectiva cantidad 
			de digitos pares al costado comentados
		*/
		
		@BeforeEach
		public void setUp() throws Exception {
			
			// Se crea el arreglo de numeros enteros
			list = new ArrayList<Integer>();
			
			// Creo la instancia de donde voy a llamar los metodos de la consigna del ejercicio
			consigna2 = new DesarmandoNumeros();
			
			// Se le agrega unos 10 casos
			
			list.add(5834); 	// <- cant de pares: 2 
			list.add(2468); 	// <- cant de pares: 4 
			list.add(1357); 	// <- cant de pares: 0 
			list.add(9021022); 	// <- cant de pares: 6 
			list.add(444); 		// <- cant de pares: 3 
			list.add(123456); 	// <- cant de pares: 3 
			list.add(8001); 	// <- cant de pares: 3 
			list.add(77772); 	// <- cant de pares: 1 
			list.add(6000); 	// <- cant de pares: 4 
			list.add(1110); 	// <- cant de pares: 1 
			
		}
		
		// Se verifica la cantidad de pares
		
		@Test
		void testElQueMasTiene() {
			// Guardo el numero con mayor cantidad de digitos pares dentro de la array list
				int valorEsperado = 9021022;
				int valorResultante = consigna2.mayorCantidadDigitosPares(list);
			
			// Compruebo que el valor esperado sea "9021022"
				assertEquals(valorEsperado, valorResultante);
		}
		
		@Test
		void testCantidadDigitosPar() {
			//Coloco el valor esperado y una cadena int con 4 numeros pares 
				int valorEsperado = 4;
				int valorResultante = consigna2.cantidadDigitosPar(6000);
					
			// Compruebo que cant sea el valor esperado
				assertEquals(valorEsperado, valorResultante);
		}
		
		@Test
		void testDigitosDe() {
			// Creo una arrayList con los elementos que espero ver en el resultado
				ArrayList<Integer> valorEsperado = new ArrayList<Integer>();
				valorEsperado.add(1);
				valorEsperado.add(2);
				valorEsperado.add(3);
				
			// Guardo el resultado de llamar a la func
				ArrayList<Integer> valorResultante = consigna2.digitosDe(321);
					
			// Compruebo que el resultado sea el esperado
				assertEquals(valorEsperado, valorResultante);
		}
}
