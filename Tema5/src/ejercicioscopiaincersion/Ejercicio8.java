package ejercicioscopiaincersion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		int[] array = new int[1];
		int v;
		int i;
		int cant;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor inicial");
		v = sc.nextInt();
		System.out.println("Introduzca el incremento");
		i = sc.nextInt();
		System.out.println("Introduzca la cantidad de elementos a crear");
		cant = sc.nextInt();
		array[0] = v;
		for (int j = 1; j < cant; j++) {
			array = Arrays.copyOf(array, array.length+1);
			v += i;
			array[j] = v;
		}
		System.out.println(Arrays.toString(array));
		sc.close();
	}
}
