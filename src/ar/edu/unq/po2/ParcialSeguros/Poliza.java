package ar.edu.unq.po2.ParcialSeguros;

import java.util.ArrayList;

public abstract class Poliza {
	private ArrayList<Item> inventario;
	private ArrayList<GastoAdministrativo> gastos;
	private FasePoliza fase;
	private double descuentoActual;
	private CodigoPromocionService servicePromocion; 
	private MailSender mail;
    public Poliza(CodigoPromocionService servicePromocion, MailSender mail) {
        this.inventario = new ArrayList<>();
        this.gastos = new ArrayList<>();
        this.fase = new FaseAbierta();
        this.descuentoActual = 0;
        this.servicePromocion = servicePromocion;
        this.mail = mail;
    }

	public double montoAsegurado() {
		double total=0;
		for(Item i: inventario) {
			total += i.calcularPrecio();
		}
		return total ; // precio items
	}
	public double elPrecio() {
		return (this.montoAsegurado()* 0.0075) + this.gastosAdministrativos() - descuentoActual; // no lo diice, lo supongo al descuento aca 
	}
	public double gastosAdministrativos() {
		double total=0;
		for(GastoAdministrativo i: gastos) {
			total += i.getMonto();
		}
		return total; // gastos
	}
	public void aplicarBonificacion(int codigo) {

		if(this.validarCodigo(codigo)) {
			double descuentoNuevo = this.calcularDecuento();
			this.procedimientoSegunFase();
			this.verificarDescuento(descuentoNuevo);
			String comprobanteDescuento = this.emitirComprobante(descuentoNuevo); 
			this.enviarComprobante(comprobanteDescuento);
		}

	}
	public Boolean validarCodigo( int codigo) {
		return servicePromocion.codigoValido(codigo);
	}
	
	public abstract double calcularDecuento();  
	
	public void procedimientoSegunFase() {
		fase.procedimiento(this);
	}
	public void verificarDescuento(double descuentoNuevo) {
		if(descuentoNuevo > descuentoActual) {
			this.setDescuentoActual(descuentoNuevo);
		}
	}
	
	public abstract String emitirComprobante(double descuento);
	
	public void enviarComprobante(String comprobanteDescuento) {  
		mail.notificar(comprobanteDescuento);
	}
	
	public void agregarItemAlInventario(Item item) {
		inventario.add(item);
	}
	public void agregarGasto(GastoAdministrativo gasto) {
		gastos.add(gasto);
	}
	public void removerGastos() {
		gastos.clear();
	}
	
	
	// getter y setters 
	
	
	public double getDescuentoActual() {
		return descuentoActual;
	}
	public void setDescuentoActual(double descuentoActual) {
		this.descuentoActual = descuentoActual;
	}
	public ArrayList<Item> getInventario() {
		return inventario;
	}
	public void setInventario(ArrayList<Item> inventario) {
		this.inventario = inventario;
	}
	public ArrayList<GastoAdministrativo> getGastos() {
		return gastos;
	}
	public void setGastos(ArrayList<GastoAdministrativo> gastos) {
		this.gastos = gastos;
	}
	public FasePoliza getFase() {
		return fase;
	}
	public void setFase(FasePoliza fase) {
		this.fase = fase;
	}
	
}
