package supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	public ProductoPrimeraNecesidad(String string, double d, boolean b) {
		super(string, d, b);
	}
	
	private double descuento() {return 0.9;}

}
