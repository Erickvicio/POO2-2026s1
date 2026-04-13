package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
	public void add(int n) {
		this.arrayList.add(n);
	}
	
	public int sumarTodo() {
		int resultado = 0;
		
		for(int n:arrayList) {
			resultado += n;
		}
		return resultado;
	}
	
	public int restarTodo() {
		int resultado = 0;
		
		for(int n:arrayList) {
			resultado -= n;
		}
		return resultado;
	}
	
	public int multTodo() {
		int resultado = 1;
		
		for(int n:arrayList) {
			resultado *= n;
		}
		return resultado;
	}
	
	
	
}
