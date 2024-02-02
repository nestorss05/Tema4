package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En la clase Main se le pedira al usuario notas de ciertos alumnos y ciertas
 * asignaturas
 * 
 * @author Nestor Sanchez
 * 
 */
public class MainCode {

	/**
	 * final int notas[][]: array donde se guardaran alumnos y notas
	 */
	public static final int NOTAS[][] = new int[4][5];
	
	/**
	 * Codigo principal del programa
	 */
	public static void main(String[] args) {

		// boolean pase: variable que indica si la respuesta es valida
		boolean pase = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For: mediante los alumnos, pidele al usuario una nota de una asignatura
		for (int i = 0; i < NOTAS.length; i++) {
			for (int j = 0; j < NOTAS[i].length; j++) {
				do {
					try {
						System.out.println("Inserta una nota");
						System.out.println("Alumno " + i+1);
						System.out.println("Asignatura " + j);
						NOTAS[i][j] = sc.nextInt();
						if (NOTAS[i][j] < 0 || NOTAS[i][j] > 10) {
							System.out.println("ERROR: Nota fuera del rango");
						} else {
							pase = true;
						}
					} catch (InputMismatchException e) {
						System.out.println("ERROR: Respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!pase);
				pase = false;
			}
		} // Fin For

		// Muestra las notas por pantalla mediante la funcion notasAlumno
		Notas.notasAlumno(NOTAS);

		// Cierra el Scanner
		sc.close();

	}

}
