package TPDoubles;

public class Carta {
	private String palo;
	private String numero;

	public Carta(String numero, String palo) {
		this.setPalo(palo);
		this.setNumero(numero);
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
