package ejercicioscopiaincersion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int[] a = new int[15];
		int[] b = new int[15];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Introduzca un número");
			a[i] = sc.nextInt();
		}
		System.arraycopy(a, 0, b, 1, 14);
		b[0] = a[a.length-1]; 
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		System.out.println(Arrays.toString(a));
 	}
}
