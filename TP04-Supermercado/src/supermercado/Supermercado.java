package supermercado;

import java.util.ArrayList;

public class Supermercado {
	
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	
	private void setNombre(String nombre) {this.nombre = nombre;}
	private void setDireccion(String direccion) {this.direccion = direccion;}
	
	public Supermercado(String nombre, String direccion) {
		setNombre(nombre); setDireccion(direccion);
	}

	public int getCantidadDeProductos() {return productos.size();}

	public void agregarProducto(Producto unProducto) {
		productos.add(unProducto);
	}

	public double getPrecioTotal() {
		double montoTotal = 0;
		for(Producto p:productos) {
			montoTotal += p.getPrecio();
		}
		return montoTotal;
	}

}
