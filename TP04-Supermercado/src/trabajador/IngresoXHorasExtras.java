package trabajador;

public class IngresoXHorasExtras extends Ingreso{
	
	private int cantidadHorasExtras;
	public int getCantidadHorasExtras() {return cantidadHorasExtras;}
	
	private void setCantidadHorasExtras(int cantidadHorasExtras) {
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	
	
	public IngresoXHorasExtras(String mesPercepcion,String concepto,double montoPercibido, int cantidadHorasExtras) {
		super(mesPercepcion, concepto, montoPercibido);
		setCantidadHorasExtras(cantidadHorasExtras);
	}
	
	public double getMontoImponible() {
		return 0;
	}
	
	public double getMontoPercibido() {
	    return super.getMontoPercibido() * getCantidadHorasExtras();
	}
	
}
