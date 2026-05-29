package ar.edu.unq.po2.tp5;

public abstract class Producto implements Cobrable {
	private String nombre;
	private double precio;
	private int stock;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void decrementarStock() {
		stock -= 1;
	}
	public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
	@Override
	public void procesar() {
		this.decrementarStock();
	}
}
