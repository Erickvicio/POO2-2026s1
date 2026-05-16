package mercadoCentral;

public class Producto_Cooperativa extends Producto {

	 private final double PORCENT_DESC = 0.10;
	
	public Producto_Cooperativa(int cantidad, double precioBase) {
		super(cantidad, precioBase);
	}
	
	public double montoAPagar() {
		return super.montoAPagar() * PORCENT_DESC; 
	}

	
}
