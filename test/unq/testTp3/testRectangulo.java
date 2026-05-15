package unq.testTp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

class testRectangulo {
	private Point punto;
	private Rectangulo r; 
	private Cuadrado c;
	@BeforeEach 
	public void setUp() {
		 punto = new Point();
		 r = new Rectangulo(punto,10,5);
		 c = new Cuadrado(punto,10);
	}
	
	
	@Test
	void testR() {
		int resultadoAreaR = r.calcularArea();
		int resultadoPeriR = r.calcularPerimetro();
		
		assertEquals(50, resultadoAreaR);
		assertEquals(100, resultadoPeriR);
	}
	void testC() {
		int resultadoAreaC = c.calcularArea();
		int resultadoPeriC = c.calcularPerimetro();
		assertEquals(100, resultadoAreaC);
		assertEquals(200, resultadoPeriC);
	}

}
