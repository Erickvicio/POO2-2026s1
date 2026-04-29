package trabajador;

import java.util.ArrayList;

public class Trabajador {
	static final double PORC_IMPUESTO = 2;

	private ArrayList<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();
	
	public double getTotalPercibido() {
		double acumulador = 0;
		for(Ingreso i:ingresosPercibidos) {
			acumulador += i.getMontoPercibido();
		}
		return acumulador;
	}
	public double getMontoImponible() {
		double acumulador = 0;
		for(Ingreso i:ingresosPercibidos) {
			acumulador += i.getMontoImponible();
		}
		return acumulador;
	}
	public double getImpuestoAPagar() {
		return getMontoImponible() * (PORC_IMPUESTO / 100);
	}
	
	public void percibirIngreso(Ingreso i) {
		ingresosPercibidos.add(i);
	}
	
}
