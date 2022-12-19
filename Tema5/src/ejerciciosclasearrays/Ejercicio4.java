package ejerciciosclasearrays;

import java.util.Arrays;

public class Ejercicio4 {
	public static void main(String[] args) {
		int[] random = new int[30];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random()*10);
		}
		Arrays.sort(random);
		System.out.println(Arrays.toString(random));
	}
}
