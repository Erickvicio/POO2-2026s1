package mercadoCentral;

//import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTestCase{
	
	private Producto_Cooperativa pCooperativa;
	private Producto_Empresa pEmpresa;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		int stockCooperativa = 3;
		double precioCooperativa = 150;
		pCooperativa = new Producto_Cooperativa(stockCooperativa, precioCooperativa); 
		
		int stockEmpresa = 150;
		double precioEmpresa = 79;
		pEmpresa = new Producto_Empresa(stockEmpresa, precioEmpresa);
	}
	
	@Test
	void obtenerPrecio() {
		
		double valorEsperado = 150 * 0.10;
		double valorObtenido = pCooperativa.montoAPagar();
		
		assertEquals(valorEsperado, valorObtenido);
		
		valorEsperado = 79;
		valorObtenido = pEmpresa.montoAPagar();
		
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	void restarDelStock(){
		
		pCooperativa.realizarPago();
		pCooperativa.realizarPago();
		
		int valorEsperado = 1;
		int valorObtenido = pCooperativa.getStock();
		
		assertEquals(valorEsperado, valorObtenido);
		
		for(int i = 0; i < 30; i++) {
			pEmpresa.realizarPago();
		}
		
		valorEsperado = 120;
		valorObtenido = pEmpresa.getStock();
		
		assertEquals(valorEsperado, valorObtenido);
		
		//assertThrows(Exception.class, () -> {pCooperativa.restarStock(100);});

	}

}
