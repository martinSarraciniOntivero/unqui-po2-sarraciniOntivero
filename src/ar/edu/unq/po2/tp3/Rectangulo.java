package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point posicion;
	private int ancho;
	private int alto;
	public Point getPosicion() {
		return posicion;
	}
	public void setPosicion(Point posicion) {
		this.posicion = posicion;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public  Rectangulo(Point posicion, int ancho, int alto) {
		this.setPosicion(posicion);
		this.setAncho(ancho);
		this.setAlto(alto);
	}
	public int calcularArea() {
		return ancho * alto;
		
	}
	public int calcularPerimetro() {
		return this.calcularArea() *2;
	}
	
}
