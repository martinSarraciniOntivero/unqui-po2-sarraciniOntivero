package TestDouble;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import TPDoubles.PokerStatus;



public class TestVerificaPoquer {

    private PokerStatus pokerStatus; // El objeto a probar (SUT: System Under Test)

    @BeforeEach
    public void setUp() {
        // SETUP: Inicializamos el objeto antes de cada prueba
        pokerStatus = new PokerStatus();
    }

    @Test
    public void testTienePokerCuandoHayCuatroCartasConMismoNumero() {
        // EXERCISE: Ejecutamos el método que queremos probar
        boolean resultado = pokerStatus.verificar("1P", "1C", "1D", "1T", "KD");

        // VERIFY: Comprobamos si el resultado es el esperado
        assertTrue(resultado, "Debería retornar true cuando hay cuatro cartas iguales");
    }
    @Test 
    public void testTienePokerCuandoNoHayCuatroCartasConMismoNumero() {
        // EXERCISE: Ejecutamos el método que queremos probar
        boolean resultado = pokerStatus.verificar("1P", "3P", "3D", "1T", "KD");

        // VERIFY: Comprobamos si el resultado es el esperado
        assertFalse(resultado, "Debería retornar true cuando no hay cuatro cartas iguales");
    }
    
    
    
}