package unq.testTp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

class TestMultioperador {

	@Test
	
	void test() {
		Multioperador m = new Multioperador();
		m.set(new int[] {10, 3, 2});
		int resultadoSuma = m.sumarElementos();
		int resultadoResta = m.restarElementos();
		int resultadoMul = m.mulElementos();
		assertEquals(15, resultadoSuma);
		assertEquals(5, resultadoResta);
		assertEquals(60, resultadoMul);
	}

}
