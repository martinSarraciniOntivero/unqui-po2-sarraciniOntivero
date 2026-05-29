package ar.edu.unq.po2.tp5;

public class AgenciaRecaudadora implements Agencia {

    private int cantidadPagosRegistrados = 0;

    @Override
    public void registrarPago(Factura factura) {

        this.cantidadPagosRegistrados++;
    }

    public int getCantidadPagosRegistrados() {
        return cantidadPagosRegistrados;
    }
}

