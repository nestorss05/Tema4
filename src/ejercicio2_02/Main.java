package ejercicio2_02;

import java.util.Arrays;

// Clase Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// numeros: tabla donde se guardaran los valores
		int numeros[] = new int[55];

		// posicionMinima: posicion minima a aplicar en cada iteracion
		int posicionMinima = 0;

		// posicionMaxima: posicion maxima a aplicar en cada iteracion
		int posicionMaxima = 0;

		// For I: Iteracion en la que se rellenaran los valores y se sumara 1 a
		// posicionMinima
		for (int i = 1; i <= 10; i++) {
			posicionMinima = posicionMaxima + 1;
			// For J: bucle donde se le sumaran i veces a posicionMaxima
			for (int j = 1; j <= i; j++) {
				posicionMaxima++;
			} // Fin For J
			Arrays.fill(numeros, posicionMinima - 1, posicionMaxima, i);
		} // Fin For I

		// Muestra todo el array
		System.out.println(Arrays.toString(numeros));

	} // Fin Funcion Main

} // Fin Clase Main
