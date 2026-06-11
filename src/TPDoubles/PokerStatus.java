package TPDoubles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {
	private List<Jugada> jugadas;
	
    public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
 
        Carta[] cartas = {
                new Carta(c1),
                new Carta(c2),
                new Carta(c3),
                new Carta(c4),
                new Carta(c5)
            };
    	for(Jugada jugada: jugadas) {
    		if(jugada.cumpleJugada(cartas)) {
    			return jugada.getNombre();
    		}
    	}
    	return "no hay ninguna jugada";
    	/*Map<String,Integer> contador = new HashMap<>();
    	
    	for(Carta carta: cartas) {
    		String valor = carta.obtenerValorNum();
    		contador.put(valor, contador.getOrDefault(valor, 0)+1);
    	}
    	return contador.containsValue(4);*/
    	
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
