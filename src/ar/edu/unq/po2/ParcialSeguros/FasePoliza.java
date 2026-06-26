package ar.edu.unq.po2.ParcialSeguros;

public interface FasePoliza {
	public void agregarItem(Poliza poliza,Item item);
	public void cerrarInventario(Poliza poliza);
	public void pagar(Poliza poliza);
	public void cancelar(Poliza poliza);
	public void procedimiento(Poliza poliza);
}
