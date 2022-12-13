package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		int[] array = new int[100];
		int n;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (1 + Math.random()*10);
		}
		System.out.println("Introduzca el número entre 1 y 10 que desea buscar");
		n = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if(array[i]==n) System.out.println("El número " + n + " está en la posición " + (i+1));
		}
		sc.close();
	}
}
