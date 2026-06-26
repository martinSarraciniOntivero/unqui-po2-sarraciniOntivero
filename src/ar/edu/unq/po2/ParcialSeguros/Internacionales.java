package ar.edu.unq.po2.ParcialSeguros;

public class Internacionales extends Poliza{

	public Internacionales(CodigoPromocionService servicePromocion, MailSender mail) {
		super(servicePromocion, mail);
	}
	@Override
	public double calcularDecuento() {
		double total = 0;
		for(Item i: this.getInventario()) {
			total += this.precioMayorA250Mil(i);
		}
		return total;
	}
	public double precioMayorA250Mil(Item item) {
		double p=0;
		if(item.calcularPrecio() > 250000) {
			p = item.calcularPrecio() * 0.05;
		}
		return p;
	}

	@Override
	public String emitirComprobante(double descuento) {
		
		return "emite comprobante de descuento por productos de valor mayor a 250000 por el valor de"+descuento+"pesos";
	}

}
