package ar.edu.unq.po2.tp5;

public abstract class Factura implements Cobrable {
	private AgenciaRecaudadora agencia;

	public Factura(AgenciaRecaudadora agencia2) {
		this.agencia = agencia2;
	}

	public AgenciaRecaudadora getAgencia() {
		return agencia;
	}

	public void setAgencia(AgenciaRecaudadora agencia) {
		this.agencia = agencia;
	}
	public void procesar() {
		this.agencia.registrarPago(this);
	}
	
	public abstract double getPrecio();
	



}
