package supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	private double descuentoUnico = 0;
	
	protected double descuento() {return descuentoUnico;}
	private void setDescuentoUnico(double descuentoUnico) {this.descuentoUnico = descuentoUnico;}
	
	public ProductoPrimeraNecesidad(String string, double d, double descuento) {
		super(string, d, true);
		setDescuentoUnico(descuento);
	}
	

}
