package unq.testTp3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Ejercicio3;

class TestEjercicio3 {
	
	@Test
	void testMultiplos() {
	    Ejercicio3 v = new Ejercicio3();
	    v.setX(3);
	    v.setY(9);

	    int resultado = v.multiploMayorDe();

	    assertEquals(999, resultado);
	}
}