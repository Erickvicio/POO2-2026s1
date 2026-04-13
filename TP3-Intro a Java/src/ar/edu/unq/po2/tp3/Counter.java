package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
	public void addNumber(int n) {
		arrayList.add(n);
	}
	
	public int getEvenOcurrences() {
		int cant = 0;
		
		for (Integer n:arrayList) {
			if(n % 2 == 0) cant++;
		}
		return cant;
	}
	
	public int getOddOcurrences() {
		int cant = 0;
		
		for (Integer n:arrayList) {
			if(n % 2 != 0) cant++;
		}
		return cant;
	}
	
	public int getMultiplesOf(int m) {
		int cant = 0;
		
		for (Integer n:arrayList) {
			if(n % m == 0) cant++;
		}
		return cant;
	}
	
}
