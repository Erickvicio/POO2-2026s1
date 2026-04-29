package supermercado;

import java.util.function.BooleanSupplier;

public class Producto {

	private String nombre;
	private double precio;
	private boolean flag = false;
	
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setPrecio(double precio) {
		this.precio = precio;
	}
	private void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	protected double descuento() {return 0;}
	
	public Producto(String string, double d, boolean b) {
		setNombre(string); setPrecio(d); setFlag(b);
	}

	public Producto(String string, double d) {
		setNombre(string); setPrecio(d);
	}

	public String getNombre() {return nombre;}
	
	public double getPrecio() {
		double total = (esPrecioCuidado()) ? precio * (1 - descuento() / 100) : precio;
		return total;
	}

	public void aumentarPrecio(double d) {
		setPrecio(precio + d);
		
	}
	public boolean esPrecioCuidado() {
		return flag;
	}

}
