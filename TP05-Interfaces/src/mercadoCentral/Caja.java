package mercadoCentral;

import java.util.ArrayList;

public class Caja {
	
	private ArrayList<Factura> aCobrar = new ArrayList<Factura>(); 
	
	
	public boolean cajaVacia() { return aCobrar.isEmpty(); }

	public void registrarFactura(Factura unaFactura){
		
			aCobrar.add(unaFactura);
	}

	public double montoTotal() {
		
		return aCobrar.stream()
						.mapToDouble(f -> f.montoAPagar())
						.sum(); 
	}

	public void realizarPago(){
		aCobrar.stream()
				.forEach(f -> f.realizarPago());
		
		aCobrar.clear();
	}

}
