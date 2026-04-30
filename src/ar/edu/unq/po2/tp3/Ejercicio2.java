package ar.edu.unq.po2.tp3;

public class Ejercicio2 {
	public int numeroConMasPares(int[] arr) {
		int maxPares = -1;
		int resultado = arr[0];
		
		for(int i =0; i < arr.length; i++) {
			int num = arr[i];
			int contador = 0;
			int aux = Math.abs(num);
			
			if(aux == 0) {
				contador = 1;
			}
			
			while(aux != 0) {
				int digito = aux %10;
				if(digito %2 == 0) {
					contador += 1;
				}
				aux = aux/10;
			}
			if(contador > maxPares) {
				maxPares = contador;
				resultado = num;
			}
			
		}		
	    return resultado; 
	}
}
