package unq.testTp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.ProductoEmpresa;
import ar.edu.unq.po2.tp5.ProductoCooperativa;
import ar.edu.unq.po2.tp5.Servicio; 
import ar.edu.unq.po2.tp5.Impuesto; 
import ar.edu.unq.po2.tp5.AgenciaRecaudadora; 

public class TestCaja {

    @Test
    public void testRegistrarCobrablesCalculaMontoYRestaStock() {
     
        Caja caja = new Caja(); 
        AgenciaRecaudadora agencia = new AgenciaRecaudadora();
        
        ProductoEmpresa yerba = new ProductoEmpresa("Yerba", 1000.0, 5);
        ProductoCooperativa azucar = new ProductoCooperativa("Azúcar", 1000.0, 5);
        
       
        Servicio luz = new Servicio("Luz", 100.0, 2, agencia);
        
       
        Impuesto inmobiliario = new Impuesto(500.0, agencia);


        caja.registrar(yerba);
        caja.registrar(azucar);
        caja.registrar(luz);
        caja.registrar(inmobiliario);
       /* System.out.println("Precio yerba: " + yerba.getPrecio());
        System.out.println("Precio azúcar: " + azucar.getPrecio());
        System.out.println("Precio luz: " + luz.getPrecio());
        System.out.println("Precio impuesto: " + inmobiliario.getPrecio());*/
        double montoFinal = caja.montoTotal();


        assertEquals(2600.0, montoFinal, 0.01, "El monto total calculado no es el correcto");
        
     
        assertEquals(4, yerba.getStock());
        assertEquals(4, azucar.getStock());
        

        assertEquals(2, agencia.getCantidadPagosRegistrados(), "La agencia debería tener 2 registros de pago");
    }
}