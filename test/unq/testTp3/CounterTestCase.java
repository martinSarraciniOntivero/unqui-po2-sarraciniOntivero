package unq.testTp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ar.edu.unq.po2.tp3.Counter;

public class CounterTestCase {
private Counter counter;

@BeforeEach
public void setUp() throws Exception {

counter = new Counter();

	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
	}


@Test
public void testEvenNumbers() {

	int amount = counter.contarPares();

	assertEquals(amount, 1);
	}
@Test 
public void testOddNumbers() {
	int amount = counter.contarImpares();
	
	assertEquals(amount,9);
	}
}



















