package mercadoCentral;

public class Producto implements Factura{
	
	private int stock;
	private double precioBase;
	
	public Producto(int cantidad, double precioBase){
		this.stock = cantidad; this.precioBase = precioBase;
	}
	
	/*
	public void restarStock(int cantidad) throws Exception {
		if (cantidad > stock) throw new Exception("No hay stock de la cantidad solicitada");
		
		stock -= cantidad;
	}
	*/
	
	public double montoAPagar() {
		return precioBase;
	}
	
	public void realizarPago(){
		//if (stock <= 0) throw new Exception("No hay stock de la cantidad solicitada");
		
		stock--;
	}
	
	public int getStock() { return stock;} 
}
