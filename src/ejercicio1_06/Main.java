package ejercicio1_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Define la tabla donde se guardaran los numeros introducidos por el usuario
		int numeros[] = new int[8];

		// Correcto: booleana que comprueba el correcto funcionamiento del Try-Catch
		boolean correcto = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For: pide al usuario un numero
		for (int i = 0; i < numeros.length; i++) {
			do {
				try {
					correcto = false;
					System.out.println("Inserta un numero");
					numeros[i] = sc.nextInt();
					correcto = true;
				} catch (InputMismatchException e) {
					System.out.println("ERROR: Respuesta incorrecta");
				} finally {
					sc.nextLine();
				} // Fin Try-Catch
			} while (!correcto); // Fin Do While
		} // Fin For
		
		// For-Each: comprueba si un numero es par o impar
		for (int valor: numeros) {
			if (valor%2==0) {
				System.out.println("Numero par");
			} else {
				System.out.println("Numero impar");
			}
		} // Fin For-Each

		// Cierra el Scanner
		sc.close();
	}

}
