package mercadoCentral;

public class Servicio implements Factura {
	
	private Agencia agencia;
	private int unidadesConsumidas;
	private double costePorUnidad;
	
	public Servicio(double costePorUnidad, int unidadesConsumidas, Agencia agencia) {
		this.costePorUnidad= costePorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
		this.agencia = agencia;
	}

	@Override
	public double montoAPagar() {
		return unidadesConsumidas * costePorUnidad;
	}

	@Override
	public void realizarPago() {
		agencia.registrarPago(this);
	}

}
