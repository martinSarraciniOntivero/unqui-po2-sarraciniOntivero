package ar.edu.unq.po2.tp3;

import java.util.ArrayList; 

public class Counter {
	private ArrayList<Integer>numeros;
	
	public Counter() {
		numeros = new ArrayList<Integer>();
	}
	public void agregarNumero(int numero) {
		numeros.add(numero);
	}
	
	public int contarPares() {
		int contador = 0;
		for(int numero: numeros) {
			if(numero %2 ==0) {
				contador += 1;
			}
		}
		return contador;
	}
	
	public int contarImpares() {
		int contador = 0;
		for(int numero: numeros) {
			if(numero %2 !=0) {
				contador += 1;
			}
		}
		return contador;
	}
	
	public int cantMultiplosDe(int x) {
		int contador =0;
		for(int numero: numeros) {
			if(numero %x == 0) {
				contador += 1;
			}
		}
		return contador; 
	}
	
	
	
	
	
	
	
	
	
}
