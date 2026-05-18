package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
//import java.util.OptionalDouble;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Person> integrantes;
	public ArrayList<Person> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(ArrayList<Person> personas) {
		this.integrantes = personas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public EquipoDeTrabajo(String nombre ) {
		this.setNombre(nombre); // puedo poner this.nombre  = nombre.
		integrantes = new ArrayList<Person>();
		
	}
	public void agregarIntegrante(Person p) {
		integrantes.add(p);
	}
	/*public OptionalDouble promedioEdad() { // solucion con streams
		return  integrantes.stream().mapToInt(p -> p.getEdad()).average();
	}*/
	public double promedioEdad() {

	    int suma = 0;

	    for (Person p : integrantes) {

	        suma += p.getEdad();
	    }

	    return (double) suma / integrantes.size();
	}
}
