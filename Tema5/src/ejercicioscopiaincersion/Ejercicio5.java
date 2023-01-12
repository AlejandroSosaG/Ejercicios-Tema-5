package ejercicioscopiaincersion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		int[] tablaEnteros = new int[10];
		int[] numPares = new int[0];
		int[] numImpares = new int[0];
		int indice=0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tablaEnteros.length; i++) {
			System.out.println("Introduzca un número");
			tablaEnteros[i] = sc.nextInt();
			if(tablaEnteros[i]%2==0) {
				numPares = Arrays.copyOf(numPares, numPares.length+1);
				numPares[indice] = tablaEnteros[i];
				indice++;
			}
		}		
		indice = 0;
		for (int i = 0; i < tablaEnteros.length; i++) {
			if(tablaEnteros[i]%2!=0) {
				numImpares = Arrays.copyOf(numImpares, numImpares.length+1);
				numImpares[indice] = tablaEnteros[i];
				indice++;
			}
		}
		System.out.println(Arrays.toString(numPares));
		System.out.println(Arrays.toString(numImpares));
		sc.close();
	}
}
