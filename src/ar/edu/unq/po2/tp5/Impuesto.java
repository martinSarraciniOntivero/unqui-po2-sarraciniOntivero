package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	private double tasa;

	public Impuesto(double d, AgenciaRecaudadora agencia) {
		super(agencia);
		this.setTasa(d);
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	@Override
	public double getPrecio() {
		return this.getTasa();
	}
	
}
