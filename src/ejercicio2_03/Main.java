package ejercicio2_03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// tabla1: array donde se guardaran los 10 primeros numeros
		int tabla1[] = new int[10];

		// tabla2: array donde se guardaran los 10 ultimos numeros
		int tabla2[] = new int[10];

		// correcto: booleana que comprobara el correcto funcionamiento del Try-Catch
		boolean correcto = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For 1: pìde al usuario 10 valores para tabla1
		for (int i = 0; i < tabla1.length; i++) {
			do {
				try {
					correcto = false;
					System.out.println("Inserta un numero para tabla1");
					tabla1[i] = sc.nextInt();
					correcto = true;
				} catch (InputMismatchException e) {
					System.out.println("ERROR: Respuesta invalida");
				} finally {
					sc.nextLine();
				}
			} while (!correcto);
		} // Fin For 1

		// For 2: pìde al usuario 10 valores para tabla2
		for (int i = 0; i < tabla2.length; i++) {
			do {
				try {
					correcto = false;
					System.out.println("Inserta un numero para tabla2");
					tabla2[i] = sc.nextInt();
					correcto = true;
				} catch (InputMismatchException e) {
					System.out.println("ERROR: Respuesta invalida");
				} finally {
					sc.nextLine();
				}
			} while (!correcto);
		} // Fin For 2
		
		// If-Else: informale al usuario si las dos tablas son iguales o no
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las dos tablas son iguales");
		} else {
			System.out.println("Las dos tablas son distintas");
		} // Fin If-Else
		
		// Cierra el Scanner
		sc.close();

	} // Fin Funcion Main

} // Fin Clase Main
