package TestSolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import TPSolid.Cliente;
import TPSolid.CreditoPersonal;

public class TestSolicitudCreditoPersonal {

    @Test
    public void creditoPersonalAceptable() {

        Cliente cliente =
                new Cliente(
                        "Juan",
                        "Perez",
                        "Quilmes",
                        30,
                        5000);

        CreditoPersonal solicitud =
                new CreditoPersonal(
                        cliente,
                        12000,
                        12);

        assertTrue(solicitud.esAceptable());
    }


    @Test
    public void creditoPersonalNoAceptable() {

    	Cliente cliente =
    		new Cliente(
                    "Juan",
                    "Perez",
                    "Quilmes",
                    30,
                    1000);

    	CreditoPersonal solicitud =
            new CreditoPersonal(
                    cliente,
                    12000,
                    12);

    assertFalse(solicitud.esAceptable());
    }
}



