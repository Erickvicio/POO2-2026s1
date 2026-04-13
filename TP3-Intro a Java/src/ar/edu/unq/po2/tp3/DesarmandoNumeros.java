package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class DesarmandoNumeros {

	
	// Dado una arrayList de numeros enteros, devuelve el numero con la mayor cantidad de digitos pares
	public int mayorCantidadDigitosPares(ArrayList<Integer> arreglo) {
		
		// Arranco con el primero del arreglo ya que "0" es un numero par y podria contar en casos donde no haya numeros con "0" como digito
		int resultado = cantidadDigitosPar(arreglo.getFirst());  
		for(int n:arreglo) {
			
			resultado = (cantidadDigitosPar(n) > cantidadDigitosPar(resultado) ) ? n : resultado;
		}
		return resultado;	
	}
	
	
	// Dado un numero entero (int) devuelve la cantidad de digitos del mismo que son pares
	public int cantidadDigitosPar(int n) {
		
		ArrayList<Integer> digitos = digitosDe(n);
		
		int resultado = 0;
		for(int num:digitos) {
			resultado = (num % 2 == 0) ? resultado+1 : resultado; // <- Si se cumple la cond, asigna el primer argumento, sino, el segundo.
		}
		return resultado;
	}
	
	// Dado un numero entero (int) devuelve una ArrayList con todos sus digitos separados
	public ArrayList<Integer> digitosDe(int n) {
		
		ArrayList<Integer> contenedor = new ArrayList<Integer>();
		
		while(n>0) {
			contenedor.add(n % 10);
			n = n /10;
		}
		return contenedor;
		
		
	}
	
}
