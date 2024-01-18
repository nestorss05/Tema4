package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Main
public class Main {
	
	// Funcion Main
	public static void main(String[] args) {
		
		// int t[]: array que tendra una longitud aleatoria de 1 a 10
		int t[] = new int[(int) ((Math.random() * 10)+1)];
		
		// int clave: valor a buscar
		int clave = 0;
		
		// boolean pase: variable que indica si la respuesta es valida
		boolean pase = false;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// For: rellenaremos la tabla de valores aleatorios
		for (int i = 0; i < t.length; i++) {
			
			// Se generara un numero del 1 al 15
			t[i] = (int) ((Math.random() * 15)+1);
			
		} // Fin For
		
		// Do While: Pide al usuario un valor a buscar
		do {
			try {
				pase = false;
				System.out.println("Inserta un valor a buscar");
				clave = sc.nextInt();
				if (clave < 1 || clave > 15) {
					System.out.println("ERROR: El valor debe ser entre 1 y 15");
				} else {
					pase = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!pase); // Fin Do While
		
		// Llama a la funcion buscar para buscar la clave y muestrala por pantalla
		System.out.println(Busqueda.buscar(t, clave));
		
		// Cierra el Scanner
		sc.close();
		
	} // Fin Funcion Main

} // Fin Clase Main