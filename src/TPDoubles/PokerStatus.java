package TPDoubles;


import java.util.List;


public class PokerStatus {
	private List<Jugada> jugadas;
	
    public String verificar( List<Carta> cartas) {
 

    	for(Jugada jugada: jugadas) {
    		if(jugada.cumpleJugada(cartas)) {
    			return jugada.getNombre();
    		}
    	}
    	return "sin jugada";
    	
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
