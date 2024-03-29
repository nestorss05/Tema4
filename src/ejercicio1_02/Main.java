package ejercicio1_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
		
	// Clase Main
	public static void main(String[] args) {
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Crea la tabla numeros
		double numeros[] = new double[5];	
		
		// correcto: booleana que comprobara el try catch
		boolean correcto = false;
		
		// Pide al usuario numeros del array
		for (int i = 0; i < numeros.length; i++) {
			// Do While
			do {
				// Fin Try Catch
				try {
					correcto = false;
					System.out.println("Inserta un numero");
					numeros[i] = sc.nextDouble();
					correcto = true;
				} catch (InputMismatchException e) {
					System.out.println("ERROR: Respuesta invalida");
				} finally {
					sc.nextLine();
				} // Fin Try Catch
			} while (!correcto); // Fin Do While
			
		} // Fin For
		
		// Muestra la tabla
		PideYMuestra.MuestraTabla(numeros);
		
		// Cierra el Scanner
		sc.close();
	} // Fin Clase Main

}
