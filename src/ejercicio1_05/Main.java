package ejercicio1_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crea la tabla
		double numeros[] = new double[10];

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Correcto: booleana que comprobara el try catch
		boolean correcto = false;
		
		// numMayor: numero mas grande
		double numMayor = 0;
		
		// numMenor: numero mas pequeño
		double numMenor = 0;
		
		// numTotal: suma de todos los numeros
		double numTotal = 0;

		// For: pide al usuario los valores de los numeros
		for (int i = 0; i < numeros.length; i++) {
			
			// Do While
			do {
				try {
					correcto = false;
					System.out.println("Inserta un numero");
					numeros[i] = sc.nextDouble();
					correcto = true;
				} catch (InputMismatchException e) {
					System.out.println("ERROR: Respuesta Invalida");
				} finally {
					sc.nextLine();
				}
			} while (!correcto); // Fin Do While
			
			// Ve asignando la suma de los numeros
			numTotal = numTotal + numeros[i];
			
			// Comprueba valores maximos y minimos
			if (i==0) {
				numMayor = numeros[i];
				numMenor = numeros[i];
			} else {
				if (numeros[i] > numMayor) {
					numMayor = numeros[i];
				}
				if (numeros[i] < numMenor) {
					numMenor = numeros[i];
				}
			}
			
		} // Fin For

		// Muestra la suma de todos los numeros
		System.out.println("Suma de todos los numeros: " + numTotal);
		
		// Muestra el numero mayor de todos
		System.out.println("Numero mayor: " + numMayor);
		
		// Muestra el numero menor de todos
		System.out.println("Numero menor: " + numMenor);
		
		// Cierra el Scanner
		sc.close();
		
	}

}
