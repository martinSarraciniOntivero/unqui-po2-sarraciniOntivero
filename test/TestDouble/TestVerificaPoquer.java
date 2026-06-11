package TestDouble;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TPDoubles.Jugada;
import TPDoubles.Poker;
import TPDoubles.PokerStatus;
import TPDoubles.Carta;
import TPDoubles.Color;
import TPDoubles.Trio;


public class TestVerificaPoquer {
	private List<Carta> cartasPoker;
	private List<Carta> cartasNoPoker;
	private List<Carta> cartasColor;
	private List<Carta> cartasNoColor;
	private List<Carta> cartasTrio;
	private List<Carta> cartasNoTrio;
    private PokerStatus pokerStatus; // El objeto a probar (SUT: System Under Test)

    @BeforeEach
    public void setUp() {
        // SETUP: Inicializamos el objeto antes de cada prueba
    	 cartasPoker = List.of(
    		    new Carta("A", "P"),
    		    new Carta("A", "C"),
    		    new Carta("A", "D"),
    		    new Carta("A", "T"),
    		    new Carta("5", "P")
    		);
    	 cartasNoPoker = List.of(
    			    new Carta("A", "P"),
    			    new Carta("2", "C"),
    			    new Carta("4", "D"),
    			    new Carta("7", "T"),
    			    new Carta("K", "P")
    			);
    	 cartasColor = List.of(
    		    new Carta("2", "P"),
    		    new Carta("5", "P"),
    		    new Carta("8", "P"),
    		    new Carta("J", "P"),
    		    new Carta("K", "P")
    		);
    	 cartasNoColor = List.of(
    		    new Carta("2", "P"),
    		    new Carta("5", "P"),
    		    new Carta("8", "P"),
    		    new Carta("J", "C"),
    		    new Carta("K", "P")
    		);
    	 cartasTrio = List.of(
    		    new Carta("7", "P"),
    		    new Carta("7", "C"),
    		    new Carta("7", "D"),
    		    new Carta("J", "T"),
    		    new Carta("K", "P")
    		);
    	 cartasNoTrio = List.of(
    			    new Carta("7", "P"),
    			    new Carta("7", "C"),
    			    new Carta("2", "D"),
    			    new Carta("J", "T"),
    			    new Carta("K", "P")
    			);
        List<Jugada> jugadas = List.of(
                new Poker(),
                new Color(),
                new Trio()
            );
        pokerStatus = new PokerStatus(jugadas);
    }

    @Test
    public void testTienePokerCuandoHayCuatroCartasConMismoNumero() {
        // EXERCISE: Ejecutamos el método que queremos probar
        String resultado = pokerStatus.verificar(cartasPoker);

        // VERIFY: Comprobamos si el resultado es el esperado
        assertEquals("Poker", resultado);
    }
    @Test 
    public void testNoTienePokerCuandoNoHayCuatroCartasConMismoNumero() {
        // EXERCISE: Ejecutamos el método que queremos probar
        String resultado = pokerStatus.verificar(cartasNoPoker);

        // VERIFY: Comprobamos si el resultado es el esperado
        assertEquals("sin jugada", resultado);
    }
    @Test 
    public void testTieneColorCuandoHayCincoCartasConMismoPalo() {
        // EXERCISE: Ejecutamos el método que queremos probar
        String resultado = pokerStatus.verificar(cartasColor);

        // VERIFY: Comprobamos si el resultado es el esperado
        assertEquals("Color", resultado);
    }
    @Test
    public void testNoTieneColorCuandoNoHayCincoCartasConMismoPalo() {
        // EXERCISE: Ejecutamos el método que queremos probar
        String resultado = pokerStatus.verificar(cartasNoColor);

        // VERIFY: Comprobamos si el resultado es el esperado
        assertEquals("sin jugada", resultado);
    }
   @Test 
   public void testTieneTrioCuandoHayTresCartasConMismoValor() {
       // EXERCISE: Ejecutamos el método que queremos probar
       String resultado = pokerStatus.verificar(cartasTrio);

       // VERIFY: Comprobamos si el resultado es el esperado
       assertEquals("Trio", resultado);
   }
   @Test 
   public void testNoTieneTrioCuandoNoHayTresCartasConMismoValor() {
       // EXERCISE: Ejecutamos el método que queremos probar
       String resultado = pokerStatus.verificar(cartasNoTrio);

       // VERIFY: Comprobamos si el resultado es el esperado
       assertEquals("sin jugada", resultado);
   }
   
   
   
   
   
   
   
   
   
   
   
}