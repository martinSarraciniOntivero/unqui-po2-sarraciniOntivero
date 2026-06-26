package ar.edu.unq.po2.ParcialSeguros;

public class FaseVigente implements FasePoliza{ // preguntar 

	@Override
	public void agregarItem(Poliza poliza, Item item) {
	
		
	}

	@Override
	public void cerrarInventario(Poliza poliza) {
		
		
	}

	@Override
	public void pagar(Poliza poliza) {
		
		
	}

	@Override
	public void cancelar(Poliza poliza) {
		poliza.removerGastos();
		poliza.setFase(new FaseAbierta());
		
	}

	@Override
	public void procedimiento(Poliza poliza) {
		poliza.removerGastos();
		
	}

}
