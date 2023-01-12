package ejercicioscopiaincersion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[] a = new int[20];
		int[] b = new int[20];
		int indice = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*100);
			if(a[i]%2==0) {
				b[indice]=a[i];
				indice++;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0) {
				b[indice]=a[i];
				indice++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		System.out.println(Arrays.toString(a));
	}
}