package TPDoubles;

public class Carta {
	private String numero;
	private String tipo;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public Carta(String numero, String tipo) {
		this.setNumero(numero);
		this.setTipo(tipo);
	}
	public static Carta desdeString(String str) {
		String palo = str.substring(str.length() - 1);
		String numero = str.substring(0, str.length() - 1);
		return new Carta(numero, palo);
	}

}
