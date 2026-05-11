package ar.edu.unq.po2.tp3;

public class Multioperador {
	int [] arregloDeEnteros;
	public int[] get() {
		return arregloDeEnteros;
	}
	public void set(int[] numeros) {
		this.arregloDeEnteros= numeros;
	}
	
	public int sumarElementos() {
		int resultado = arregloDeEnteros[0];
		for(int i = 1; i < arregloDeEnteros.length; i++ ) {
			resultado += arregloDeEnteros[i];
		}
		return resultado;
	}
	public int restarElementos() {
		int resultado = arregloDeEnteros[0];
		for(int i = 1; i < arregloDeEnteros.length; i++ ) {
			resultado -= arregloDeEnteros[i];
		}
		return resultado;
	}
	public int mulElementos() {
		int resultado = arregloDeEnteros[0];
		for(int i = 1; i < arregloDeEnteros.length; i++ ) {
			resultado *= arregloDeEnteros[i];
		}
		return resultado;
	}
}
