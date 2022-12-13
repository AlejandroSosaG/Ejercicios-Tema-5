package ejercicios;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[] array = new int[10];
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*100+1);
			suma += array[i];
		}
		System.out.println("La suma de todos los números de la tabla es " + suma);
	}
}
