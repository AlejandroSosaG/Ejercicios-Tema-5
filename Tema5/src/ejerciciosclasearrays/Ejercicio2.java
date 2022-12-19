package ejerciciosclasearrays;

import java.util.Arrays;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[] array = new int[55];
		Arrays.fill(array, 1);
		Arrays.fill(array, 1, 3, 2);
		Arrays.fill(array, 3, 6, 3);
		Arrays.fill(array, 6, 10, 4);
		Arrays.fill(array, 10, 15, 5);
		Arrays.fill(array, 15, 21, 6);
		Arrays.fill(array, 21, 28, 7);
		Arrays.fill(array, 28, 36, 8);
		Arrays.fill(array, 36, 45, 9);
		Arrays.fill(array, 45, 55, 10);
		System.out.println(Arrays.toString(array));
	}
	
	
}
