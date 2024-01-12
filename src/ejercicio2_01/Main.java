package ejercicio2_01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// valorN: valor maximo del array
		int valorN = 0;

		// valorMaximo: valor maximo del array
		int valorM = 0;
		
		// tabla: tabla de numeros en array
		int tabla[];

		// correcto: booleana que comprobara el correcto funcionamiento del try-catch
		boolean correcto = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario los valores maximos y minimos
		// Do While N
		do {
			// Try Catch
			try {
				correcto = false;
				System.out.println("Inserta un numero para la longitud de la tabla");
				valorN = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta Invalida");
			} finally {
				sc.nextLine();
			} // Fin Try Catch
		} while (!correcto); // Fin Do While N

		// Do While M
		do {
			// Try Catch
			try {
				correcto = false;
				System.out.println("Inserta un valor entero para rellenarlo en todas las celdas del array");
				valorM = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta Invalida");
			} finally {
				sc.nextLine();
			} // Fin Try Catch
		} while (!correcto); // Fin Do While M

		// Asigna la longitud al array
		tabla = new int[valorN];
		
		// Rellena todo del mismo valor
		Arrays.fill(tabla, valorM);
		
		// Muestra el array por pantalla
		System.out.println(Arrays.toString(tabla));
		
		// Cierra el Scanner
		sc.close();
		
	} // Fin Funcion Main

} // Fin Clase Main
