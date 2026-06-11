package TPDoubles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poker implements Jugada {
	
	@Override
	public boolean cumpleJugada(List<Carta> cartas) {
    	Map<String,Integer> contador = new HashMap<>();
    	
    	for(Carta carta: cartas) {
    		String valor = carta.getNumero();
    		contador.put(valor, contador.getOrDefault(valor, 0)+1);
    	}
    	return contador.containsValue(4);
	}

	@Override
	public String getNombre() {
		
		return "Poker";
	}

}
