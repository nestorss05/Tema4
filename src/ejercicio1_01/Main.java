package ejercicio1_01;

import java.util.Random;

public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// Inicia el rand
		Random rand = new Random();

		// numeros[]: tabla de 10 de largo
		int numeros[] = new int[10];

		// For: recorrera la tabla y le asignara numeros aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(100) + 1;
			System.out.println(numeros[i]);
		} // Fin For

	} // Fin Main

}
