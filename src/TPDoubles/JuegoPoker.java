package TPDoubles;

//import java.util.List;

public class JuegoPoker {
	private PokerStatus pokerStatus;
	
	public PokerStatus getPokerStatus() {
		return pokerStatus;
	}

	public void setPokerStatus(PokerStatus pokerStatus) {
		this.pokerStatus = pokerStatus;
	}/*
	public List<Carta> determinarGanador(List<Carta> mano1, List<Carta> mano2){
		TipoDeJugada jugadaMano1 = pokerStatus.verificar(mano1);
		TipoDeJugada jugadaMano2 = pokerStatus.verificar(mano2);
		
		if(jugadaMano1.getJerarquia() > jugadaMano2.getJerarquia() ) {
			return mano1;
		}else if(jugadaMano1.getJerarquia() < jugadaMano2.getJerarquia()){
			return mano2;
		}else {
			return this.determinarDesempate(mano1, mano2)
		}
	}
	public List<Carta> determinarDesempate(List<Carta> mano1, List<Carta> mano2){
		
	}*/
}
