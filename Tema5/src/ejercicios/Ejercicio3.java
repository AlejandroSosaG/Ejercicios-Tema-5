package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int[] tabla = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número entero");
			tabla[i] = sc.nextInt();
			System.out.println("El número guardado en la posición " + i + " es " + tabla[i]);
		}
		sc.close();
	}
}
