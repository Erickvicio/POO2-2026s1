package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Producto_CooperativoTestCase{

	private Producto_Cooperativa producto;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		int stockCooperativa = 30; 
		double precioCooperativa = 1500;
		producto = new Producto_Cooperativa(stockCooperativa, precioCooperativa); 
	}
	
	@Test
	void obtenerPrecio() {
		
		double valorEsperado = 1500 * 0.10;
		double valorObtenido = producto.montoAPagar();
		
		assertEquals(valorEsperado, valorObtenido);
		
	}

}
