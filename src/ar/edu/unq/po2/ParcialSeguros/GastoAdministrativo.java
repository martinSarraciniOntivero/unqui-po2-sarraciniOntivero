package ar.edu.unq.po2.ParcialSeguros;

public class GastoAdministrativo {
	private String concepto;
	private double monto;
	
	public  GastoAdministrativo(String concepto, double monto) {
		this.setConcepto(concepto);
		this.setMonto(monto);
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
}
