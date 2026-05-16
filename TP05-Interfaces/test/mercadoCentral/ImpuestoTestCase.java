package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoTestCase {

	private Impuesto monotributoArca;
	private Agencia arca = new AgenciaEjemplo();
	
	@BeforeEach
	public void setUp() throws Exception {
		
		monotributoArca = new Impuesto(1500324, arca);
	}
	
	@Test
	void test() {
		
		double valorEsperado = 1500324;
		double valorObtenido = monotributoArca.montoAPagar();
		
		assertEquals(valorEsperado, valorObtenido);
		
	}

}
