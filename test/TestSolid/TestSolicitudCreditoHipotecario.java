package TestSolid;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import TPSolid.Cliente;
import TPSolid.CreditoHipotecario;
import TPSolid.Propiedad;

class TestSolicitudCreditoHipotecario {

	@Test
	public void creditoHipotecarioAceptable() {

	    Cliente cliente =
	            new Cliente(
	                    "Ana",
	                    "Lopez",
	                    "Berazategui",
	                    40,
	                    10000);

	    Propiedad propiedad =
	            new Propiedad(
	                    "Casa",
	                    "Calle 123",
	                    100000);

	    CreditoHipotecario solicitud =
	            new CreditoHipotecario(
	                    cliente,
	                    50000,   
	                    24,
	                    propiedad);

	    assertTrue(solicitud.esAceptable());
	}
	 @Test
	    public void creditoHipotecarioNoAceptablePorEdad() {

	        Cliente cliente =
	                new Cliente(
	                        "Juan",
	                        "Perez",
	                        "Quilmes",
	                        60,
	                        10000);

	        Propiedad propiedad =
	                new Propiedad(
	                        "Casa",
	                        "Calle 123",
	                        100000);

	        CreditoHipotecario solicitud =
	                new CreditoHipotecario(
	                        cliente,
	                        50000,
	                        120,
	                        propiedad);

	        assertFalse(solicitud.esAceptable());
	    }
}
