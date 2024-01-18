package ejercicio03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// int array[]: tabla donde se guardaran los valores generados de la funcion rellenaPares
		int array[];
		
		// int longitud: longitud del array
		int longitud = -1;

		// int fin: numero limite para el array de numeros aleatorios pares
		int fin = -1;

		// boolean pase: variable que indica si la respuesta es valida
		boolean pase = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do While 1: pide al usuario la longitud del array
		do {
			try {
				pase = false;
				System.out.println("Inserta la longitud del array");
				longitud = sc.nextInt();
				if (longitud >= 1) {
					pase = true;
				} else {
					System.out.println("ERROR: El numero debe ser 1 o superior");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			} // Fin Try Catch
		} while (!pase); // Fin Do While 1

		// Do While 2: pide al usuario un numero par
		do {
			try {
				pase = false;
				System.out.println("Inserta un numero par limitrofe");
				fin = sc.nextInt();
				if (fin % 2 == 0) {
					if (fin == 2) {
						System.out.println(
								"NOTA: El numero introducido es 2. La tabla solo se rellenara con el numero 2");
					}
					pase = true;
				} else {
					System.out.println("ERROR: El numero es impar");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			} // Fin Try Catch
		} while (!pase); // Fin Do While 2
		
		// Llama a la funcion rellenaPares para que te devuelva un array
		array = CreaArray.rellenaPares(longitud, fin);

		// Muestra el array por pantalla
		System.out.println(Arrays.toString(array));
		
		// Cierra el Scanner
		sc.close();
		
	} // Fin Funcion Main

} // Fin Clase Main