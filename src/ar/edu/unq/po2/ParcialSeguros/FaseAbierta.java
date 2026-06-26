package ar.edu.unq.po2.ParcialSeguros;

public class FaseAbierta implements FasePoliza {

	@Override
	public void agregarItem(Poliza poliza, Item item) {
		poliza.agregarItemAlInventario(item);
		
	}

	@Override
	public void cerrarInventario(Poliza poliza) { 
		poliza.setFase(new FaseCerrada());
		
	}

	@Override
	public void pagar(Poliza poliza) { // estos no hacen nada,
		
		
	}

	@Override
	public void cancelar(Poliza poliza) { // estos no hacen nada
		
		
	}

	@Override
	public void procedimiento(Poliza poliza) {
		poliza.agregarGasto(new GastoAdministrativo("Bonificación Administrativa", -500) );
	}

}
