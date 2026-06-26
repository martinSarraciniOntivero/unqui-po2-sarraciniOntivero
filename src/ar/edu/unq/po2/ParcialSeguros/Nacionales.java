package ar.edu.unq.po2.ParcialSeguros;



public class Nacionales extends Poliza {

	
	
	public Nacionales(CodigoPromocionService servicePromocion, MailSender mail) {
		super(servicePromocion, mail);
	}
	@Override
	public double calcularDecuento() {
		double total = 0;
		for(Item i: this.getInventario()) {
			total += this.sumaONo(i);
		}
		return total;
	}
	public double sumaONo(Item item) {
		double p = 0;
		if(item.getCantidad() > 10) {
			p =  item.calcularPrecio() * 0.1;
		}
		return p;
		
	}
	@Override
	public String emitirComprobante(double descuento) {
		return "comprobante de descuento por cantidad de items mayor a 10 por el valor de" +descuento+"pesos";
	}

}
