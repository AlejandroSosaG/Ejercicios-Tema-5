package ejercicioscopiaincersion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		int indice = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Introduzca un número");
			a[i] = sc.nextInt();
			if(esPrimo(a[i])==true) {
				b[indice]=a[i];
				indice++;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if(esPrimo(a[i])==false) {
				b[indice]=a[i];
				indice++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}
	/**
	 * Esta función se encarga de decir si el número que se le pasa por parámetro es primo o no.
	 * @param n
	 * @return
	 */
	public static boolean esPrimo(int n) {
		boolean primo = true; // Esta variable es la que nos dirá si el número introducido por el usuario es primo o no, y la inicializamos con valor true.
		/*
		 * Recorremos el bucle mientras que i sea menor a num más uno entre dos a la vez que el valor de i va aumentando.
		 * @i Se inicializa con valor 2.
		 */
		for (int i = 2; i < n + 1 / 2; i++) {
			 // Si el resto de dividir num entre i es igual a cero asignamos a la variable primo el valor false.
			 if (n % i == 0) {
				 primo = false;
			 }			
		}
		// Devolvemos el valor de la variable primo.
		return primo;
	}
}
