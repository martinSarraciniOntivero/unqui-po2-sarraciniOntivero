package TPDoubles;

public class Carta {
	private String palo;
	private String numero;
	private ValoresCarta valorCarta; 

	public Carta(String numero, String palo,ValoresCarta valorCarta ) {
		this.setPalo(palo);
		this.setNumero(numero);
		this.setValorCarta(valorCarta);
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

	public ValoresCarta getValorCarta() {
		return valorCarta;
	}

	public void setValorCarta(ValoresCarta valorCarta) {
		this.valorCarta = valorCarta;
	}
	public int getValorNumerico() {
	    return valorCarta.getValor();
	}
}
