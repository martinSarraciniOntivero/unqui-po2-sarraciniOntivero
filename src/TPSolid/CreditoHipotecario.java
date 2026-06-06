package TPSolid;

public class CreditoHipotecario extends SolicitudCredito {
	private Propiedad garantia;
	
	public CreditoHipotecario(Cliente cliente, double montoSolicitado, int plazoMeses, Propiedad garantia) {
		super(cliente, montoSolicitado, plazoMeses);
		this.garantia = garantia;
	}
	public Propiedad getGarantia() {
		return garantia;
	}

	public void setGarantia(Propiedad garantia) {
		this.garantia = garantia;
	}
	@Override
	public boolean esAceptable() {
		boolean cuotaMensualValida =  this.getMontoCuotaMensual() <= this.getCliente().getSueldoMensual() * 0.50;
		boolean montoTotalValido = this.getMontoSolicitado() <= this.getGarantia().getValorFiscal() * 0.70;
		double edadFinal = this.getCliente().getEdad() + (this.getPlazoMeses() / 12.0);
		boolean edadValida = edadFinal <= 65;
		return cuotaMensualValida && montoTotalValido && edadValida;
	}



}
