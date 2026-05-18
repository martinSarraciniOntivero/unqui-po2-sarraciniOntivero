package ar.edu.unq.po2.tp3;

import java.util.Date;

public class Persona {
	private String nombre;
	private int edad;
	private Date fechaNac;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Boolean menorQue(Persona persona) {
		return this.edad < persona.edad; 
	}
	public Persona(String nombre, Date fecha) {
		this.setNombre(nombre);
		this.setFechaNac(fecha);
	}

}


/*
Respuesta de teoria: La clase conoce que puede obtener el valor mediante un método público (por ejemplo un getter),
 					pero no conoce cómo se calcula internamente dicho valor. 
 					El mecanismo de abstracción que permite esto es el encapsulamiento.

*/