package TPDoubles;

public class Carta {
	private String codigo;

	public Carta(String codigo) {
		this.setCodigo(codigo);
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String obtenerValorNum() {
		 return codigo.substring(0, codigo.length() - 1);
	}
	public String obtenerValorPalo() {
		return codigo.substring(codigo.length()-1);
	}
}
