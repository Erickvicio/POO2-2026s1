package trabajador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TrabajadorTestCase {
	
	
	private Trabajador juan = new Trabajador();
	
	private Ingreso i1 = new Ingreso("Enero", "Lomas de burro", 154423);
	private Ingreso i2 = new Ingreso("Junio", "Construir una casa", 847561);
	private Ingreso i3 = new Ingreso("Diciembre", "Resolver la hambruna mundial", 75005);
	
	private Trabajador pepe = new Trabajador();
	
	private IngresoXHorasExtras h1 = new IngresoXHorasExtras("Noviembre","Crew en McDonalds",12982d,6);
	private IngresoXHorasExtras h2 = new IngresoXHorasExtras("Julio","Crew Cinepolis",15751d,8);
	private IngresoXHorasExtras h3 = new IngresoXHorasExtras("Agosto","Heladero en Grido",9845d,10);

	@BeforeEach
	public void setUp() throws Exception {
		
		juan.percibirIngreso(i1);	pepe.percibirIngreso(h1);
		juan.percibirIngreso(i2);	pepe.percibirIngreso(h2);
		juan.percibirIngreso(i3);	pepe.percibirIngreso(h3);
		
	}
	
	@Test
	void testGetTotalPercibido() {
		
		double montoEsperado 	= 1076989;
		double montoResultante 	= juan.getTotalPercibido();
		
		assertEquals(montoEsperado, montoResultante);
		
		double montoEsperado2 		= 302350;
		double montoResultante2 	= pepe.getTotalPercibido();
		
		assertEquals(montoEsperado2, montoResultante2);
	}
	
	@Test
	void testMontoImponible() {
		
		double montoEsperado 	= 1076989;
		double montoResultante 	= juan.getMontoImponible();
		
		assertEquals(montoEsperado, montoResultante);
		
		double montoEsperado2 		= 0;
		double montoResultante2 	= pepe.getMontoImponible();
		
		assertEquals(montoEsperado2, montoResultante2);
	}
	
	@Test
	void testImpuestoAPagar() {
		
		double montoEsperado 	= 21539.78;
		double montoResultante 	= juan.getImpuestoAPagar();
		
		assertEquals(montoEsperado, montoResultante);
		
		double montoEsperado2 		= 0;
		double montoResultante2 	= pepe.getImpuestoAPagar();
		
		assertEquals(montoEsperado2, montoResultante2);
	}
	
	

}
