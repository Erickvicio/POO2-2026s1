package mercadoCentral;

public class Impuesto implements Factura {

	private Agencia agencia;
	private double tasaDeServicio;
	
	public Impuesto(double tasaDeServicio,Agencia agencia) {
		this.tasaDeServicio = tasaDeServicio;  this.agencia = agencia; 
	}

	@Override
	public double montoAPagar() {
		return tasaDeServicio;
	}

	@Override
	public void realizarPago() {
		agencia.registrarPago(this);
	}

}
