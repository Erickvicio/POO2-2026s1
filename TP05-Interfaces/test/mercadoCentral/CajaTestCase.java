package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase{

	
	private Caja unaCaja;
	
	private Producto_Cooperativa p1;
	private Producto_Cooperativa p2;
	private Producto_Empresa p3;
	private Producto_Empresa p4;
	
	@BeforeEach
	public void setUp() throws Exception {
		unaCaja = new Caja();
		
		p1 = new Producto_Cooperativa(10, 100);
		p2 = new Producto_Cooperativa(17, 120);
		p3 = new Producto_Empresa(50, 250);
		p4 = new Producto_Empresa(32, 45);
		
	}
	
	@Test
	void registrarProductos() throws Exception {
		
		assertTrue(unaCaja.cajaVacia());
		
		int cantidadARegistrar = 5;
		
		for(int i = 0; i < cantidadARegistrar; i++) {
			
			unaCaja.registrarFactura(p1); 
		}
		assertFalse(unaCaja.cajaVacia());
		
		unaCaja.realizarPago();
		
		int stockActual = p1.getStock();
		int stockEsperado = 5;
		
		assertEquals(stockEsperado, stockActual);
		assertTrue(unaCaja.cajaVacia());
		
	}
	
	@Test
	void montoTotalTest() throws Exception {
		
		
		for (int i = 0; i < 25; i++) {
			unaCaja.registrarFactura(p3);	// <- (cantidad) 25 * (precio) 250 = 6250
		}
		
		for (int i = 0; i < 21; i++) {
			unaCaja.registrarFactura(p4);	// <- 21 * 45 = 945
		}
		
		
		double valorEsperado 	= 7195;
		double valorActual 		= unaCaja.montoTotal();
		
		assertEquals(valorEsperado, valorActual);
		
		for (int i = 0; i < 9; i++) {
			unaCaja.registrarFactura(p1); 	//(cantidad) 9 * (precion con 10%) 10 = 90
		}
		
		for (int i = 0; i < 10; i++) {
			unaCaja.registrarFactura(p2);	// 10 * 12 = 120
		}
				
		valorEsperado 		= 7195 + 210;
		valorActual 		= unaCaja.montoTotal();
		
		assertEquals(valorEsperado, valorActual);

		
	}

}
