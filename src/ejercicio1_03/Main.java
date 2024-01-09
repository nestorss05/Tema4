package ejercicio1_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Clase Main
	public static void main(String[] args) {

		// Crea la tabla de 10 de longitud
		int numeros[] = new int[10];

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// correcto: booleana que comprobara el correcto funcionamiento del Try-Catch
		boolean correcto = false;

		// Recorre la tabla y pide numeros
		for (int i = 0; i < numeros.length; i++) {
			do {
				try {
					correcto = false;
					System.out.println("Inserta un numero");
					numeros[i] = sc.nextInt();
					correcto = true;
				} catch (InputMismatchException e) {
					System.out.println("ERROR: Respuesta invalida");
				} finally {
					sc.nextLine();
				}
			} while (!correcto);
		} // Fin For
		
		// Recorre la tabla pero mostrando resultados de la posicion 9 a 0
		for (int i = numeros.length-1; i>=0; i--) {
			System.out.println(numeros[i]);
		}
		
		// Cierra el Scanner
		sc.close();

	} // Fin Clase Main

}
