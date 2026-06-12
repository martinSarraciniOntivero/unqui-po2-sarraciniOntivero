package TestDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TPDoubles.Carta;
import TPDoubles.Jugada;
import TPDoubles.PokerStatus;
import TPDoubles.TipoDeJugada;

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

        when(poker.getTipo())
                .thenReturn(TipoDeJugada.POKER);

        // Act
        TipoDeJugada resultado = pokerStatus.verificar(cartas);

        // verify
        assertEquals(TipoDeJugada.POKER, resultado);

        verify(poker).cumpleJugada(cartas);
        verify(poker).getTipo();

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

        when(color.getTipo())
                .thenReturn(TipoDeJugada.COLOR);

        // Act
        TipoDeJugada resultado = pokerStatus.verificar(cartas);

        // verify
        assertEquals(TipoDeJugada.COLOR, resultado);

        verify(poker).cumpleJugada(cartas);

        verify(color).cumpleJugada(cartas);
        verify(color).getTipo();

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

        when(trio.getTipo())
                .thenReturn(TipoDeJugada.TRIO);

        // Act
        TipoDeJugada resultado = pokerStatus.verificar(cartas);

        // verify
        assertEquals(TipoDeJugada.TRIO, resultado);

        verify(poker).cumpleJugada(cartas);

        verify(color).cumpleJugada(cartas);

        verify(trio).cumpleJugada(cartas);
        verify(trio).getTipo();
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

        TipoDeJugada resultado = pokerStatus.verificar(cartas);

        assertEquals(TipoDeJugada.NADA, resultado);

        verify(poker).cumpleJugada(cartas);
        verify(color).cumpleJugada(cartas);
        verify(trio).cumpleJugada(cartas);

        verify(poker, never()).getTipo();
        verify(color, never()).getTipo();
        verify(trio, never()).getTipo();
    }    
}
   
   
   
   
   
   
   
   