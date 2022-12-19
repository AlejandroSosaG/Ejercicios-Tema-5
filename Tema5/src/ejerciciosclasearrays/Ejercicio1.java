package ejerciciosclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int n;
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array");
		n = sc.nextInt();
		System.out.println("Introduzca el valor de las posiciones del array");
		m = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = m;
		}	
		System.out.println(Arrays.toString(array));
		sc.close();
	}
}
