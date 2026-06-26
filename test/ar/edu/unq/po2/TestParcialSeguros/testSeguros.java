package ar.edu.unq.po2.TestParcialSeguros;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.ParcialSeguros.CodigoPromocionService;
import ar.edu.unq.po2.ParcialSeguros.FaseAbierta;
import ar.edu.unq.po2.ParcialSeguros.FaseCerrada;
import ar.edu.unq.po2.ParcialSeguros.FaseVigente;
import ar.edu.unq.po2.ParcialSeguros.GastoAdministrativo;
import ar.edu.unq.po2.ParcialSeguros.Item;
import ar.edu.unq.po2.ParcialSeguros.MailSender;
import ar.edu.unq.po2.ParcialSeguros.Nacionales;
import ar.edu.unq.po2.ParcialSeguros.Poliza;

public class testSeguros {

    private Poliza poliza;
    private CodigoPromocionService codigoService;
    private MailSender mailSender;
    private Item martillo;
    private Item silla;
    @BeforeEach
    public void setUp() {

        codigoService = mock(CodigoPromocionService.class);
        mailSender = mock(MailSender.class);

        poliza = new Nacionales(codigoService, mailSender );
        martillo = new Item(12, 5000);
        silla = new Item(8, 25000);
        

        poliza.agregarGasto(new GastoAdministrativo("Gasto 1", 100));
        poliza.agregarGasto(new GastoAdministrativo("Gasto 2", 200));

    }
    @Test 
    public void testFaseAbiertaAgregaItem() {
    	poliza.getFase().agregarItem(poliza, martillo);
    	poliza.getFase().agregarItem(poliza, silla);
    	poliza.getFase().cerrarInventario(poliza);
    	assertEquals(2, poliza.getInventario().size());
    	assertTrue(poliza.getFase() instanceof FaseCerrada);
    }
    @Test 
    public void testFaseCerradaAgregaItem() {
    	poliza.getFase().cerrarInventario(poliza);
    	poliza.getFase().agregarItem(poliza, martillo);
    	poliza.getFase().pagar(poliza);
    	assertEquals(1, poliza.getInventario().size());
    	assertEquals(3, poliza.getGastos().size());
    	assertTrue(poliza.getFase() instanceof FaseVigente);
    }
    @Test
    public void testFaseVigenteCancela() {
    	poliza.getFase().cerrarInventario(poliza);
    	poliza.getFase().pagar(poliza);
    	poliza.getFase().cancelar(poliza);
    	assertEquals(0, poliza.getGastos().size());
    	assertTrue(poliza.getFase() instanceof FaseAbierta);
    }
    @Test
    public void testAplicarBonificacionEnPolizaVigente() {

        // Arrange
        when(codigoService.codigoValido(1234)).thenReturn(true);
        poliza.getFase().agregarItem(poliza, martillo);
        poliza.getFase().cerrarInventario(poliza);
        poliza.getFase().pagar(poliza);

        // Act
        poliza.aplicarBonificacion(1234);

        // Assert
        assertEquals(6000, poliza.getDescuentoActual());
        assertEquals(0, poliza.getGastos().size());
        verify(mailSender).notificar(anyString());
    }
    
    @Test 
    public void testPrecios() {
    	poliza.getFase().agregarItem(poliza, martillo);
    	poliza.getFase().agregarItem(poliza, silla);
    	assertEquals(260000, poliza.montoAsegurado());
    	assertEquals(300, poliza.gastosAdministrativos());
    	assertEquals(2250, poliza.elPrecio());
    }
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

