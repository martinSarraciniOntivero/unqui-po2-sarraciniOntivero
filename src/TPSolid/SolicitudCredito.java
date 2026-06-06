package TPSolid;

public abstract class SolicitudCredito {
	private Cliente cliente;
	private double montoSolicitado;
	private int plazoMeses;
    public SolicitudCredito(Cliente cliente,
            double montoSolicitado,
            int plazoMeses) {

    		this.cliente = cliente;
    		this.montoSolicitado = montoSolicitado;
    		this.plazoMeses = plazoMeses;
    }
	public double getMontoSolicitado() {
		return montoSolicitado;
	}
	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
	public int getPlazoMeses() {
		return plazoMeses;
	}
	public void setPlazoMeses(int plazoMeses) {
		this.plazoMeses = plazoMeses;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    public double getMontoCuotaMensual() {
        return montoSolicitado / plazoMeses;
    }
	public abstract boolean esAceptable();
}
