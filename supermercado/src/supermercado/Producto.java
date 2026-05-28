package supermercado;

public class Producto {
	private String nombre;
	private double precio;
	private boolean precioCuidado;
	public Producto(String nom, double p, boolean b) {
		this.setNombre(nom);
		this.setPrecio(p);
		this.setPrecioCuidado(b);
	}
	public double calcularPrecio() {
		return precio;
	}
	public void aumentarPrecio(double num) {
		precio += num;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean getPrecioCuidado() {
		return precioCuidado;
	}
	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}

}
