package ar.edu.unq.po2.tp5;

public class Servicio extends Factura{
	private double costoUnidad;
	private int cantUnidades;
	
	public Servicio(String string, double d, int i, AgenciaRecaudadora agencia) {
		// TODO Auto-generated constructor stub
		super(agencia);
		this.setCantUnidades(i);
		this.setCostoUnidad(d);
	}

	@Override
	public double getPrecio() {
		return this.getCostoUnidad() * this.getCantUnidades();
	}

	public double getCostoUnidad() {
		return costoUnidad;
	}

	public void setCostoUnidad(double costoUnidad) {
		this.costoUnidad = costoUnidad;
	}

	public int getCantUnidades() {
		return cantUnidades;
	}

	public void setCantUnidades(int cantUnidades) {
		this.cantUnidades = cantUnidades;
	}
	
}
