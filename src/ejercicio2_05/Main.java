package ejercicio2_05;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// puntuacion[]: array donde se guardan las puntuaciones
		int puntuacion[] = new int[8];

		// pase: booleana que comprueba el correcto funcionamiento del try-catch
		boolean pase = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For: registra los datos de los participantes
		for (int i = 0; i < puntuacion.length; i++) {
			do {
				try {
					pase = false;
					System.out.println("Inserta un numero");
					puntuacion[i] = sc.nextInt();
					if (puntuacion[i] < 1000 || puntuacion[i] > 2800) {
						System.out.println("ERROR: Puntuacion fuera del rango. Rango: 1000 a 2800");
					} else {
						pase = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("ERROR: Respuesta invalida");
				} finally {
					sc.nextLine();
				}
			} while (!pase);
		} // Fin For

		// Ordena la tabla
		Arrays.sort(puntuacion);

		// Para mostrar la tabla en orden inverso, se hara un if pero empezando en el
		// ultimo indice
		
		System.out.println("Puntuaciones de mas alta a mas baja");
		for (int i=puntuacion.length-1; i>=0; i--) {
			System.out.println(puntuacion[i]);
		} // Fin For

		// Cierra el Scanner
		sc.close();

	} // Fin Funcion Main

} // Clase Main
