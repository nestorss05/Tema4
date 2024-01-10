package ejercicio1_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Genera el array de 100 de largo para guardar numeros aleatorios
		int numerosAleatorios[] = new int[100];

		// celda: celda a buscar el array
		int celda = 0;

		// correcto: booleana que comprobara el correcto funcionamiento del Try-Catch
		boolean correcto = false;

		// encontrado: si el numero no fue encontrado, esta variable ayudara al programa
		// a darte respuesta si no encuentra el numero
		boolean encontrado = false;

		// Recorre el array insertando numeros aleatorios en el
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = (int) (1 + Math.random() * 10);
		} // Fin For

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero
		do {
			try {
				correcto = false;
				System.out.println("Inserta un numero a buscar");
				celda = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Valor invalido");
			} finally {
				sc.nextLine();
			} // Fin Try-Catch
		} while (!correcto); // Fin Do While

		// For: comprueba los datos que coincidan con el numero introducido
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if (numerosAleatorios[i] == celda) {
				System.out.println("El numero introducido aparece en " + i);
				encontrado = true;
			}
		} // Fin For

		// Si el numero no esta en ninguna parte, el programa le informara que no hay
		// numero encontrado
		if (!encontrado) {
			System.out.println("El numero introducido no aparece en ninguna celda");
		}

		// Cierra el Scanner
		sc.close();

	}

}
