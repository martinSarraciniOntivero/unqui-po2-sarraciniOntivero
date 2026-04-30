package unq.testTp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Ejercicio2;

public class TestEjercicio2 {
	Ejercicio2 e;
	int[] arreglo;
	
	@BeforeEach
	public void setUp()  throws Exception {
		e = new Ejercicio2();
		arreglo = new int[] {1234, 2468,1357};
		
			
		
	}
	
	@Test
	public void testNumeroConMasPares() {
		int resultado = e.numeroConMasPares(arreglo);
		assertEquals(resultado, 2468);
		
	}

}
