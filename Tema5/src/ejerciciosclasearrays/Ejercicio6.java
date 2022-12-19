package ejerciciosclasearrays;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		int[] random = new int[1000];
		int n;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random()*100);
		}
		System.out.println("Introduzca el valor que desea buscar");
		n = sc.nextInt();
		for (int i = 0; i < random.length; i++) {
			if(n==random[i]) cont++;
		}
		if(cont>0) System.out.println("El valor " + n + " existe " + cont + " veces en el array");
		else System.out.println("El valor " + n + "no existe en el array");
		sc.close();
	}
}
