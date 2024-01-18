package ejercicio03;

import java.util.Arrays;

// Clase CreaArray
public class CreaArray {

	// Funcion rellenaPares: funcion que creara un array lleno de numeros aleatorios
	// pares
	public static int[] rellenaPares(int longitud, int fin) {

		// int array[]: array que guardara los numeros pares con la longitud sacada del
		// Main
		int array[] = new int[longitud];

		// For: Genera numeros aleatorios
		for (int i = 0; i < longitud; i++) {
			array[i] = (int) (Math.random() * fin) + 1;
			// Si el numero generado es impar, se le restara 1 a i, y se machacara el
			// antiguo valor para poner uno, en lo posible que sea par
			if (array[i] % 2 != 0) {
				i--;
			}
		} // Fin For

		// Ordena la tabla
		Arrays.sort(array);

		// Devuelve array al Main
		return array;

	} // Fin Funcion rellenaPares

} // Fin CLase CreaArray