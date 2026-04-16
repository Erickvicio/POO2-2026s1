package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {

	private String nombre;
	private ArrayList<Persona> miembrosEquipo = new ArrayList<Persona>();
	
	public String getNombre() {return nombre;}
	private void setNombreEquipo(String nombre) {this.nombre = nombre;}
	
	public EquipoDeTrabajo(String nombre) {
		setNombreEquipo(nombre);
	}

	public void add(Persona persona) {
		miembrosEquipo.add(persona);
	}

	public int promedioEdad() {
		int acumulador = 0;
		for(Persona p:miembrosEquipo) {
			acumulador += p.getEdad();
		}
		return acumulador / miembrosEquipo.size();
	}

}
