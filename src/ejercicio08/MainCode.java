package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal del programa
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Se le pedira al usuario los indices de la tabla y se llamaran a las
	 * respectivas funciones para mostrar la tabla y averiguar si es simetrica
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		boolean esSimetrica;
		boolean pase = false;
		int[][] tabla = new int[4][4];

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For: pide al usuario numeros
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				do {
					try {
						ClaseTabla.imprimirTabla(tabla);
						System.out.println("Inserta un numero para i: " + i + ", j: " + j);
						tabla[i][j] = sc.nextInt();
						pase = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: Respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!pase);
				pase = false;
			}
		} // Fin For

		// Codigos respectivos
		esSimetrica = ClaseTabla.esSimetrica(tabla);

		// Imprime la tabla y muestra el resultado por pantalla
		ClaseTabla.imprimirTabla(tabla);
		System.out.println(esSimetrica);

		// Cierra el Scanner
		sc.close();

	}

}
