package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
		
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	//Setters en privado porque no quiero que el usuario tenga acceso a estas funciones
	private void setNombre(String nombre) {this.nombre = nombre;}
	private void setApellido(String apellido) {this.apellido = apellido;}
	private void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
	
	public String getNombre() {return nombre;}
	public String getApellido() {return apellido;}
	public LocalDate getFechaDeNacimiento() {return fechaNacimiento;}
	
	//Calcula la edad actual en base a un LocalDate (que entiendo es mas moderno que Date)
	public int getEdad() {
		
		LocalDate fechaNac = getFechaDeNacimiento(); 	// La fecha de nacimiento
		LocalDate hoy = LocalDate.now();				// El dia actual
		
		Period edad = Period.between(fechaNac, hoy);	//El preriodo entre uno y otro
		
		return edad.getYears();							// Me quedo con los años para saber la edad
	}
	
	public boolean menorQue(Persona persona) {
		return getEdad() < persona.getEdad();
	}
	
	public Persona(String nombre,String apellido,LocalDate fechaNacimiento) {
		setNombre(nombre); setApellido(apellido);setFechaNacimiento(fechaNacimiento);
	}
	
	
	
	
}
