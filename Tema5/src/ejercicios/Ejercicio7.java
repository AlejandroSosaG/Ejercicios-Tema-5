package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduzca un número entero");
			array[i] = sc.nextInt();
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		sc.close();
	}
}
