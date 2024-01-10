package ejercicio1_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crea la tabla donde se guardaran las temperaturas
		double temperaturas[] = new double[12];

		// correcto: booleana que comprueba el correcto funcionamiento del Try-Catch
		boolean correcto = false;
		
		// cuentaMes: contador de meses
		int cuentaMes = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For: pide al usuario las temperaturas
		for (int i = 0; i < temperaturas.length; i++) {
			// Do While
			do {
				// Try Catch
				try {
					correcto = false;
					System.out.println("Inserta un numero");
					temperaturas[i] = sc.nextDouble();
					correcto = true;
				} catch (InputMismatchException e) {
					System.out.println("ERROR: Respuesta invalida");
				} finally {
					sc.nextLine();
				} // Fin Try-Catch
			} while (!correcto); // Fin Do-While
		} // Fin For
		
		// For Each: crea el diagrama de temperaturas
		for (double valor: temperaturas) {
			cuentaMes++;
			System.out.print("Mes " + cuentaMes);
			// Codigo demasiado raro para que la tabla sea perfecta, que solo funciona en uno o dos digitos
			if (cuentaMes < 10) {
				System.out.print("  -");
			} else {
				System.out.print(" -");
			}
			if (valor < 10) {
				System.out.print(valor+"ºC - [");
			} else {
				System.out.print(valor+"ºC- [");
			}
			for (int i = 1; i <= 50; i++) {
				if (valor >= i) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.print("]");
			System.out.println();
		} // Fin For Each
		
		// Cierra el Scanner
		sc.close();
	}

}
