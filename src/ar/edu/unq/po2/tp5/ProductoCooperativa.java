package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {
	@Override 
	public double getPrecio() {
		return super.getPrecio() * 0.9;
		
	}
	public ProductoCooperativa(String nombre, double precio, int stock) {
        
        super(nombre, precio, stock); 
    }
}
