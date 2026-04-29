package trabajador;

public class Ingreso {
	
	private String mesPercepcion;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(String mesPercepcion,String concepto,double montoPercibido) {
		setMesPercepcion(mesPercepcion); setConcepto(concepto); setMontoPercibido(montoPercibido);
	}
	
	public String getMesPercepcion() {return mesPercepcion;}
	private void setMesPercepcion(String mesPercepcion) {
		this.mesPercepcion = mesPercepcion;
	}
	public String getConcepto() {return concepto;}
	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getMontoPercibido() {return montoPercibido;}
	private void setMontoPercibido(double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
	
	public double getMontoImponible() {
		return montoPercibido;
	}
	
}
