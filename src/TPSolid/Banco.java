package TPSolid;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudCredito> solicitudesCredito;
    public Banco() {

        clientes = new ArrayList<>();
        solicitudesCredito = new ArrayList<>();
    }
	public boolean agregarCliente(Cliente c) {
		return clientes.add(c);
	}
	public boolean agregarSolicitud(SolicitudCredito sc) {
		return solicitudesCredito.add(sc);
	}
	public double montoTotalADesembolsar() {
		return solicitudesCredito.stream().filter(sc -> sc.esAceptable())
										.mapToDouble(sc -> sc.getMontoSolicitado())
										.sum();
		
	}
	public ArrayList<Cliente> getClientes() {
	    return clientes;
	} 
}
