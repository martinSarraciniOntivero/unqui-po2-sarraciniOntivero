package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	private double descuento;
	public ProductoPrimeraNecesidad(String nom, double d, boolean b, double p) {
		this.setPrecio(p);
		this.setDescuento(d);
		this.setPrecioCuidado(b);
		this.setNombre(nom);
	}
	@Override
	public double calcularPrecio() {
		return super.calcularPrecio() * descuento;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
}
