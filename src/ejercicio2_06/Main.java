package ejercicio2_06;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// numerosAleatorios[]: array donde se guardaran numeros aleatorios
		int numerosAleatorios[] = new int[1000];

		// pase: booleana que comprueba el correcto funcionamiento del try-catch
		boolean pase = false;
		
		// numeroBuscar: numero a buscar
		int numeroBuscar = 0;
		
		// posicion: posicion del numero encontrado
		int posicion = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Rellena los indices con numeros aleatorios del 0 al 99 y ordenalos
		for(int i = 0; i<numerosAleatorios.length; i++) {
			numerosAleatorios[i] = (int) (Math.random() * 100);
		} // Fin For
		
		Arrays.sort(numerosAleatorios);

		// If-Else: pide al usuario por un numero
		do {
			try {
				pase = false;
				System.out.println("Inserta un numero a buscar");
				numeroBuscar = sc.nextInt();
				pase = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		}  while (!pase);
		
		// Busca el numero y guarda su posicion
		posicion = Arrays.binarySearch(numerosAleatorios, numeroBuscar);

		if (posicion == 0) {
			System.out.println("Numero encontrado en " + posicion);
		} else {
			System.out.println("El numero no se ha encontrado en ninguna parte");
		}
		
		// Cierra el Scanner
		sc.close();
		
	} // Fin Funcion Main

} // Fin Clase Main