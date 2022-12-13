package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		int[] tabla = new int[8];
		boolean par;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número entero");
			tabla[i] = sc.nextInt();
		}
		for (int i = 0; i < tabla.length; i++) {
			if(esPar(tabla[i])==true) System.out.println("El número " + tabla[i] + " es par");
			else System.out.println("El número " + tabla[i] + " es impar");
		}
		sc.close();
	}
	public static boolean esPar(int num) {
		boolean par = false;
		if(num%2==0) par = true;
		return par;
	}
}
