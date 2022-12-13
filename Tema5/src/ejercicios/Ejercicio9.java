package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		int[] mes = new int[12];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mes.length; i++) {
			System.out.println("Que temperatura media ha hecho en el mes nº " + (i+1));
			mes[i] = sc.nextInt();
		}
		
		for (int i = 0; i < mes.length; i++) {
			System.out.println("La temperatura media del mes nº " + (i+1) + " ha sido *" + mes[i] + "*");
		}
		sc.close();
	}
}
