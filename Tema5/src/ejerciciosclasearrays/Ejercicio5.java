package ejerciciosclasearrays;

import java.util.Arrays;

public class Ejercicio5 {
	public static void main(String[] args) {
		int[] puntuaciones = new int[8];
		for (int i = 0; i < puntuaciones.length; i++) {
			puntuaciones[i] = (int) (Math.random()*2800+1000);
		}		
		Arrays.sort(puntuaciones);
		for (int i = puntuaciones.length - 1; i >= 0; i--) {
			System.out.println(puntuaciones[i]);
		}
	}
}
