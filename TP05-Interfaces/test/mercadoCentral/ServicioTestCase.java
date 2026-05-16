package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTestCase {
	
	private Servicio facturaEdesur;
	private Agencia edesur = new AgenciaEjemplo();
	
	@BeforeEach
	public void setUp() throws Exception {
		
		facturaEdesur = new Servicio(70, 33, edesur);
	}
	
	@Test
	void test() {
		
		double valorEsperado = 2310;
		double valorObtenido = facturaEdesur.montoAPagar();
		
		assertEquals(valorEsperado, valorObtenido);
		
	}

}
