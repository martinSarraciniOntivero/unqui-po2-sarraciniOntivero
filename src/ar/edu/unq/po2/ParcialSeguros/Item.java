package ar.edu.unq.po2.ParcialSeguros;

public class Item {
	private int cantidad;
	private double precioPorUnidad;
	
	public Item(int cantidad, double precio) {
		this.setCantidad(cantidad);
		this.setPrecioPorUnidad(precio);
	}
	
	
	public double calcularPrecio() {
		return precioPorUnidad * cantidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioPorUnidad() {
		return precioPorUnidad;
	}
	public void setPrecioPorUnidad(double precioPorUnidad) {
		this.precioPorUnidad = precioPorUnidad;
	}
	
}
