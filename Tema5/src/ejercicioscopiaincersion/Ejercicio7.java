package ejercicioscopiaincersion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		int[] array = new int[10];
		char opc = 'a';
		int v;
		int p;
		Scanner sc = new Scanner(System.in);
		while(opc!='c') {
			System.out.println("Elija una opción:\n"
					+ "a. Mostrar valores.\n"
					+ "b. Introducir valor.\n"
					+ "c. Salir.");
			opc = sc.next().charAt(0);
			switch (opc) {
			case 'a':
				System.out.println(Arrays.toString(array));
				break;
			case 'b':
				System.out.println("Introduzca un número");
				v = sc.nextInt();
				System.out.println("Introduzca la posición");
				p = sc.nextInt();
				while(p>array.length-1) {
					array = Arrays.copyOf(array, array.length+1);
				}
				array[p] = v;
				break;
			case 'c':
				System.out.println("Ha decidido salir");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		}
	}
}
