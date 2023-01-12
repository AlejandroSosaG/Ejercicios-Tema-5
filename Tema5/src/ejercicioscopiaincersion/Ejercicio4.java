package ejercicioscopiaincersion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int[] tablaEnteros = new int[10];
		int[] repes = new int[1];
		int valor=0;
		int indice = 0;
		int pos = -1;
		boolean encontrado = false;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tablaEnteros.length; i++) {
			System.out.println("Introduzca un número");
			tablaEnteros[i] = sc.nextInt();
		}
		repes[0] = tablaEnteros[0];
		for (int i : tablaEnteros) {
			valor = tablaEnteros[i];
			encontrado = false;
			for (int j : repes) {
				if(valor == repes[j]) encontrado = true;
			}
			if(encontrado) {
				repes = Arrays.copyOf(repes, repes.length+1);
				repes[i] = valor;
			}
		}
		System.out.println(Arrays.toString(repes));
	}
}
