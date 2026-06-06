package TPSolid;

public class CreditoPersonal extends SolicitudCredito {

	public CreditoPersonal(Cliente cliente, double montoSolicitado, int plazoMeses) {
		super(cliente, montoSolicitado, plazoMeses);
		
	}

	@Override
	public boolean esAceptable() {
		boolean sueldoAnualValido = this.getCliente().getSueldoAnual() >= 15000;
		boolean sueldoMensualValido = this.getMontoCuotaMensual() <= this.getCliente().getSueldoMensual() *0.70 ;
		
		return sueldoAnualValido && sueldoMensualValido;
	}
	
}
