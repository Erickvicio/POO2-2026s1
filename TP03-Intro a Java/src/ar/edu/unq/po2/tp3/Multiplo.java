package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multiplo {

	
	// Dado dos numeros int devuelve su multiplo comun del 0 al 1000, de lo contrario devuelve -1
	public int multiploMasAlto(int x, int y) {
		
		ArrayList<Integer> multiplosX = multiplosHasta1000(x);
		ArrayList<Integer> multiplosY = multiplosHasta1000(y);
		
		int resultante = -1;

		//Dado que los elem en una array se añaden a lo ultimo, se recorrera la lista del mayor hacia el menor
		while(resultante == -1 || multiplosX.isEmpty()) {  // Esto se ejecutara hasta que cambie el valor de "-1" o la lista quede vacia
			int n = multiplosX.getFirst();
			multiplosX.removeFirst();
			resultante = (multiplosY.contains(n)) ? n : resultante;
		}
		
		return resultante;
	}

	
	//Dado un numero entero devuelve una ArrayList con TODOS SUS MULTIPLOS del 0 al 1000, la lista esta ordenada de mayor a menor
	public ArrayList<Integer> multiplosHasta1000(int n){
		
		ArrayList<Integer> contenedor = new ArrayList<Integer>();
		
		for(int i= 1000; i >= 0; i--) {
			if(i % n == 0) contenedor.add(i);
		}
		
		return contenedor;
	}
	
	
	
}
