package ejercicios;

public class Ejercicio8 {
	public static void main(String[] args) {
		int[] numeros = new int[20];
		int[] cuadrados = new int[20];
		int[] cubos = new int[20];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()*100+1);
			cuadrados[i] = numeros[i] * numeros[i];
			cubos[i] = numeros[i] * numeros[i] * numeros[i];
		}
		for (int i = 0; i < cubos.length; i++) {
			System.out.println(numeros[i] + "\t" + cuadrados[i] + "\t" + cubos[i]);
		}
	}
}
