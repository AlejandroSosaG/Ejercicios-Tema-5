package ejercicioscopiaincersion;

import java.util.Arrays;

public class Ejercicio6 {
	public static void main(String[] args) {
		int[] array = new int[100];
		int[] inverso = new int[100];
		int indice = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		System.out.println(Arrays.toString(array));
		for (int i = inverso.length-1; i >=0; i--) {
			inverso[indice] = array[i];
			indice++;
		}
		System.out.println(Arrays.toString(inverso));
	}
}
