package supermercado;

import java.util.ArrayList;

public class Supermercado {
	private ArrayList<Producto> productos;
	private String nombre;
	private String direccion;
	public Supermercado(String nom, String dir) {
		this.setNombre(nom);
		this.setDireccion(dir);
		productos = new ArrayList<Producto>();
	}
	public double getPrecioTotal() {
		double total = 0;
		for(Producto p: productos) {
			total += p.getPrecio();
		}
		return total;
	}
	public int getCantidadDeProductos() {
		return productos.size();
	}
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Producto> getProductos(){
		return productos;
	}
}
