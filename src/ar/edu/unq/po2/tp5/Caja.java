package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
	ArrayList<Cobrable> cobrables;
	public  void registrar(Cobrable cobrable) {
		cobrables.add(cobrable);
		 cobrable.procesar();
	}
	public double montoTotal() {
		 double montoTotal = 0;
		 for(Cobrable p: cobrables) {
			 montoTotal += p.getPrecio();
		 }
		 return montoTotal;
	}
	public Caja() {
	    this.cobrables = new ArrayList<>(); 
	}
}
