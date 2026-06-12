package TPDoubles;


import java.util.List;


public class PokerStatus {
	private List<Jugada> jugadas;
	
    public TipoDeJugada verificar( List<Carta> cartas) {
 

    	for(Jugada jugada: jugadas) {
    		if(jugada.cumpleJugada(cartas)) {
    			return jugada.getTipo();
    		}
    	}
    	return TipoDeJugada.NADA;
    	
    }

	public List<Jugada> getJugadas() {
		return jugadas;
	}

	public void setJugadas(List<Jugada> jugadas) {
		this.jugadas = jugadas;
	}
	public PokerStatus(List<Jugada> listaJugadas) {
		this.setJugadas(listaJugadas);
	}
	

}
