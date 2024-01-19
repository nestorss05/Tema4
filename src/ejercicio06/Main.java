package ejercicio06;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// int t[]: tabla donde se guardaran numeros aleatorios
		int t[];

		// int longitudT: longitud a asignar a t[]
		int longitudT = 0;

		// int numElementos: nº de elementos que servira como cantidad de cada lote de
		// elementos consecutivos de t
		int numElementos = 0;

		// boolean pase: variable que indica si la respuesta es valida
		boolean pase = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do While 1: pide el numero de elementos a sumar en lote
		do {
			try {
				System.out.println("Inserta el numero de elementos a sumar a la vez");
				numElementos = sc.nextInt();
				if (numElementos < 1) {
					System.out.println("ERROR: El numero debe ser 1 o mayor");
				} else {
					pase = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!pase); // Fin Do While 1

		// pase volvera a ser false, puesto a que si no, saldra del siguiente bucle nada mas termine.
		pase = false;
		
		// Do While 2: pide al usuario la longitud del array
		do {
			try {
				System.out.println("Inserta la longitud del array");
				longitudT = sc.nextInt();
				if (longitudT < numElementos) {
					System.out.println(
							"ERROR: la longitud de la tabla debe ser o igual o mayor que el numero de elementos a sumar a la vez");
				} else {
					pase = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!pase); // Fin Do While 2
		
		// El array t[] procedera a ser creado con la longitud pedida anteriormente
		t = new int[longitudT];
		
		// Llama a la funcion suma para sumar cada numElementos elementos consecutivos, y guardalo en t.
		t = Operador.suma(t, numElementos);
		
		// Muestra el array por pantalla
		System.out.println(Arrays.toString(t));
		
		// Cierra el Scanner
		sc.close();

	} // Fin Funcion Main

} // Fin Clase Main