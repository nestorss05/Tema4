package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {
		
		// int numerosEnteros[]: array donde se guardaran los numeros introducidos
		int numerosEnteros[] = new int[5];
		
		// boolean pase: variable que indica si la respuesta es valida
		boolean pase = false;
		
		// int resultado: resultado de la suma de todos los indices del array
		int resultado;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// For: pide al usuario valores
		for (int i = 0; i < numerosEnteros.length; i++) {
			do {
				try {
					pase = false;
					System.out.println("Inserta un numero");
					numerosEnteros[i] = sc.nextInt();
					pase = true;
				} catch (InputMismatchException e) {
					System.out.println("ERROR: Respuesta invalida");
				} finally {
					sc.nextLine();
				} // Fin Try Catch
			} while (!pase); // Fin Do While
		} // Fin For
		
		// Suma todos los indices del array
		resultado = Operador.suma(numerosEnteros);
		
		// Imprime el resultado por pantalla
		System.out.println("Resultado: " + resultado);
		
		// Cierra el Scanner
		sc.close();
		
	} // Fin Funcion Main

} // Clase Main
