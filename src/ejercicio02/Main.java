package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// int t[]: tabla donde se guardaran 10 valores introducidos por el usuario
		int t[] = new int[10];

		// boolean pase: variable que indica si la respuesta es valida
		boolean pase = false;
		
		// int numeroMaximo: numero maximo de todos los indices del array t
		int numeroMaximo;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For: pide al usuario un numero
		for (int i = 0; i < t.length; i++) {
			do {
				try {
					pase = false;
					System.out.println("Inserta un numero");
					t[i] = sc.nextInt();
					pase = true;
				} catch (InputMismatchException e) {
					System.out.println("ERROR: Respuesta invalida");
				} finally {
					sc.nextLine();
				}
			} while (!pase); // Fin Do While
		} // Fin For
		
		// El valor maximo de t se guardara en la variable numeroMaximo
		numeroMaximo = Operador.maximo(t);
		
		// Muestra el valor por pantalla
		System.out.println("Valor mayor de t: " + numeroMaximo);

		// Cierra el Scanner
		sc.close();
		
	} // Fin Funcion Main

} // Clase Main