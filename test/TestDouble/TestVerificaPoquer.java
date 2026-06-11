package TestDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TPDoubles.Carta;
import TPDoubles.Jugada;
import TPDoubles.PokerStatus;

public class TestVerificaPoquer {

    private PokerStatus pokerStatus;

    private Jugada poker;
    private Jugada color;
    private Jugada trio;

    private List<Carta> cartas;

    @BeforeEach
    public void setUp() {

        // Creamos los mocks
        poker = mock(Jugada.class);
        color = mock(Jugada.class);
        trio = mock(Jugada.class);

       
        cartas = List.of();

        pokerStatus = new PokerStatus(
                List.of(poker, color, trio)
        );
    }

    @Test
    public void testDevuelvePokerCuandoLaPrimeraJugadaCumple() {

        // Arrange
        when(poker.cumpleJugada(cartas))
                .thenReturn(true);

        when(poker.getNombre())
                .thenReturn("Poker");

        // Act
        String resultado = pokerStatus.verificar(cartas);

        // verify
        assertEquals("Poker", resultado);

        verify(poker).cumpleJugada(cartas);
        verify(poker).getNombre();

        verify(color, never()).cumpleJugada(any());
        verify(trio, never()).cumpleJugada(any());
    }
    @Test
    public void testDevuelveColorCuandoPokerNoCumpleYColorSi() {

        // Arrange
        when(poker.cumpleJugada(cartas))
                .thenReturn(false);

        when(color.cumpleJugada(cartas))
                .thenReturn(true);

        when(color.getNombre())
                .thenReturn("Color");

        // Act
        String resultado = pokerStatus.verificar(cartas);

        // verify
        assertEquals("Color", resultado);

        verify(poker).cumpleJugada(cartas);

        verify(color).cumpleJugada(cartas);
        verify(color).getNombre();

        verify(trio, never()).cumpleJugada(any());
    }
    @Test
    public void testDevuelveTrioCuandoPokerYColorNoCumplen() {

        // Arrange
        when(poker.cumpleJugada(cartas))
                .thenReturn(false);

        when(color.cumpleJugada(cartas))
                .thenReturn(false);

        when(trio.cumpleJugada(cartas))
                .thenReturn(true);

        when(trio.getNombre())
                .thenReturn("Trio");

        // Act
        String resultado = pokerStatus.verificar(cartas);

        // verify
        assertEquals("Trio", resultado);

        verify(poker).cumpleJugada(cartas);

        verify(color).cumpleJugada(cartas);

        verify(trio).cumpleJugada(cartas);
        verify(trio).getNombre();
    }
    @Test
    public void testDevuelveSinJugadaCuandoNingunaCumple() {

        List<Carta> cartas = List.of();

        when(poker.cumpleJugada(cartas))
                .thenReturn(false);

        when(color.cumpleJugada(cartas))
                .thenReturn(false);

        when(trio.cumpleJugada(cartas))
                .thenReturn(false);

        String resultado = pokerStatus.verificar(cartas);

        assertEquals("sin jugada", resultado);

        verify(poker).cumpleJugada(cartas);
        verify(color).cumpleJugada(cartas);
        verify(trio).cumpleJugada(cartas);

        verify(poker, never()).getNombre();
        verify(color, never()).getNombre();
        verify(trio, never()).getNombre();
    }    
}
   
   
   
   
   
   
   
   