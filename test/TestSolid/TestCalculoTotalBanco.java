package TestSolid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TPSolid.Banco;
import TPSolid.Cliente;
import TPSolid.CreditoPersonal;

class TestCalculoTotalBanco {

	@Test
	public void calcularMontoTotalADesembolsar() {

	    Banco banco = new Banco();

	    Cliente cliente =
	            new Cliente(
	                    "Juan",
	                    "Perez",
	                    "Quilmes",
	                    30,
	                    5000);

	    banco.agregarCliente(cliente);

	    CreditoPersonal s1 =
	            new CreditoPersonal(
	                    cliente,
	                    12000,
	                    12);

	    CreditoPersonal s2 =
	            new CreditoPersonal(
	                    cliente,
	                    120000,
	                    12);

	    banco.agregarSolicitud(s1);
	    banco.agregarSolicitud(s2);

	    assertEquals(
	            12000,
	            banco.montoTotalADesembolsar(),
	            0.01);
	}

}
