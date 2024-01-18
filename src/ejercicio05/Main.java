package ejercicio05;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// int t[]: array que tendra una longitud aleatoria de 1 a 10
		int t[] = new int[10];

		// int tFinal[]: array donde se mostraran los indices
		int tFinal[] = new int[10];

		// int valor: valor a buscar
		int valor = 0;

		// boolean pase: variable que indica si la respuesta es valida
		boolean pase = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For: rellenaremos la tabla de valores aleatorios
		for (int i = 0; i < t.length; i++) {

			// Se generara un numero del 1 al 15
			t[i] = (int) ((Math.random() * 15) + 1);

		} // Fin For

		// Do While: Pide al usuario un valor a buscar
		do {
			try {
				pase = false;
				System.out.println("Inserta un valor a buscar");
				valor = sc.nextInt();
				if (valor < 1 || valor > 15) {
					System.out.println("ERROR: El valor debe ser entre 1 y 15");
				} else {
					pase = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!pase); // Fin Do While

		// Llama a la funcion buscarTodos para devolver una tabla con todos los indices
		// de los elementos del valor de busqueda, y guardalo en tFinal
		tFinal = Busqueda.buscarTodos(t, valor);
		
		// Muestra la tabla por pantalla
		System.out.println(Arrays.toString(tFinal));
		
		// Cierra el Scanner
		sc.close();

	} // Fin Funcion Main

} // Fin Clase Main