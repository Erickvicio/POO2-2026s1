package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	
	private EquipoDeTrabajo equipo;

	//Integrantes del equipo
	private Persona p1;
	private Persona p2;
	private Persona p3;
	private Persona p4;
	private Persona p5;
	
	@BeforeEach
	public void setUp() throws Exception {
		
	// Inizializando las variables
		
		//Las personas que van a trabajar en el equipo
		p1 = new Persona("Rennar","de la Luna Velada", LocalDate.of(2004, 3, 15)); 			// 22
		p2 = new Persona("Malenia","Hija del Brote Carmesí", LocalDate.of(2001, 7, 8));		// 25
		p3 = new Persona("Radahn","Azote de las Estrellas", LocalDate.of(2002, 11, 20));	// 24
		p4 = new Persona("Ranni","de las Sombras Frías", LocalDate.of(2008, 1, 5));			// 18
		p5 = new Persona("Godrick","el Injertado", LocalDate.of(2006, 9, 30));				// 20
		
		//Creamos el equipo con su nombre
		equipo = new EquipoDeTrabajo("MiniManchi");
		
		//Agregamos a los miembros
		equipo.add(p1);
		equipo.add(p2);
		equipo.add(p3);
		equipo.add(p4);
		equipo.add(p5);
	}
	
	@Test
	void testNombreEquipo() {
		
		String valorEsperadoE1 		= "MiniManchi";
		String valorResultanteE1 	= equipo.getNombre();
		
		assertEquals(valorEsperadoE1, valorResultanteE1);
	}
	
	@Test
	void testPromedioEdad() {
		
		int valorEsperadoE1 		= 21;					// <- equipo de 22, 25, 24, 18 ,20 => 110 / 5 => 21
		int valorResultanteE1 		= equipo.promedioEdad();
		
		assertEquals(valorEsperadoE1, valorResultanteE1);
	}
	
	
	

}
