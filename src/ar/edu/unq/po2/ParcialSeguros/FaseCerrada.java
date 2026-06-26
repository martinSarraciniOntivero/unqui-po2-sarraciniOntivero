package ar.edu.unq.po2.ParcialSeguros;

import java.util.Comparator;

public class FaseCerrada implements FasePoliza{

	@Override
	public void agregarItem(Poliza poliza, Item item) {
		poliza.agregarItemAlInventario(item);
		double montoRecargo = item.calcularPrecio() * 0.03;
		GastoAdministrativo gastoNuevo= new GastoAdministrativo("Recargo por extensión",montoRecargo );
		poliza.agregarGasto(gastoNuevo);
	}

	@Override
	public void cerrarInventario(Poliza poliza) {
		
		
	}

	@Override
	public void pagar(Poliza poliza) { 
		poliza.setFase(new FaseVigente());
		
	}

	@Override
	public void cancelar(Poliza poliza) {
		
		
	}

	@Override
	public void procedimiento(Poliza poliza) {
		if(this.gastoMasCostoso(poliza) != null) {
			poliza.getGastos().remove(this.gastoMasCostoso(poliza));
		}

	}
	public GastoAdministrativo gastoMasCostoso(Poliza p) {
		return p.getGastos().stream().max(Comparator.comparing(GastoAdministrativo::getMonto))
                .orElse(null);
	}

}
