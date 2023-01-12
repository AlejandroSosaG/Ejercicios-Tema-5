package ejerciciosclasearrays;

import java.util.Arrays;

public class Ejercicio7 {
	public static void main(String[] args) {
		int[] apuesta = new int[6];
		int[] ganadora = new int[6];
		int valor;
		int aciertos = 0;
		for (int i = 0; i < apuesta.length; i++) {
			apuesta[i] = (int) (Math.random() * 49 + 1);
			ganadora[i] = (int) (Math.random() * 49 + 1);
		}
		Arrays.sort(ganadora);
		for (int i = 0; i < ganadora.length; i++) {
			valor = ganadora[i];
			for (int j = 0; j < ganadora.length; j++) {
				if (valor == apuesta[j])
					aciertos++;
			}
		}
		System.out.println("El número de aciertos es " + aciertos);
	}
}
