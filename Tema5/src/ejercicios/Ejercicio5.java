package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		double[] array = new double[10];
		double max = 0;
		double min = 999999999;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < array.length; i++) {
			System.out.println("Introduzca un número entero");
			array[i] = sc.nextDouble();
			if(array[i]>max) max = array[i];
			if(array[i]<min) min = array[i];
		}
		System.out.println("El máximo es " + max + " y el mínimo es " + min);
		sc.close();}
}
