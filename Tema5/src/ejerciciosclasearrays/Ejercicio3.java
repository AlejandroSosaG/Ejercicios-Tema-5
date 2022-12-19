package ejerciciosclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int[] primera = new int[10];
		int[] segunda= new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < primera.length; i++) {
			System.out.println("Introduzca un número");
			primera[i] = sc.nextInt();
		}
		for (int i = 0; i < segunda.length; i++) {
			System.out.println("Introduzca un número");
			segunda[i] = sc.nextInt();
		}
		if(Arrays.equals(primera, segunda)) System.out.println("Son iguales");
		else System.out.println("No son iguales");
		sc.close();
	}
}
