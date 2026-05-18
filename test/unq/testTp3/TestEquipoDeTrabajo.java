package unq.testTp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.Person;

class TestEquipoDeTrabajo {
	private EquipoDeTrabajo equipo1;
	private Person persona1;
	private Person persona2;
	private Person persona3;
	private Person persona4;
	private Person persona5;
	@BeforeEach 
	public void setUp() {
		persona1 = new Person("Ignacio","Ontivero", 25);
		persona2 = new Person("Martin","Sarracini", 27);
		persona3 = new Person("Lucas","Martinez", 30);
		persona4 = new Person("Thomas","Sandoval", 26);
		persona5 = new Person("Enzo","Perez", 28);
		equipo1 = new EquipoDeTrabajo("superEquipo");
		equipo1.agregarIntegrante(persona1);
		equipo1.agregarIntegrante(persona2);
		equipo1.agregarIntegrante(persona3);
		equipo1.agregarIntegrante(persona4);
		equipo1.agregarIntegrante(persona5);
	}
	@Test
	void test() {
		double promedio = equipo1.promedioEdad();
		
		assertEquals(27.2, promedio );
	}

}
