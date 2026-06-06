package TPSolid;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	public Propiedad(String d, String dir, double vf) {
		this.setDescripcion(d);
		this.setDireccion(dir);
		this.setValorFiscal(vf);
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getValorFiscal() {
		return valorFiscal;
	}
	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
}
