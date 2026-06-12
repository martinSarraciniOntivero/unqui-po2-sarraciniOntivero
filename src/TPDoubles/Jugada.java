package TPDoubles;

import java.util.List;

public interface Jugada {
	public boolean cumpleJugada(List<Carta> cartas);
	TipoDeJugada getTipo();;
}
