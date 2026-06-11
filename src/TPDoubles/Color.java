package TPDoubles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Color implements Jugada {

	@Override
	public boolean cumpleJugada(List<Carta> cartas) {
    	Map<String,Integer> contador = new HashMap<>();
    	
    	for(Carta carta: cartas) {
    		String palos = carta.getPalo();
    		contador.put(palos, contador.getOrDefault(palos, 0)+1);
    	}
    	return contador.containsValue(5);
	}

	@Override
	public String getNombre() {

		return "Color";
	}

}
