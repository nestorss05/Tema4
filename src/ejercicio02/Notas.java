package ejercicio02;

import java.util.Arrays;

/**
 * En la clase Notas, mostraremos todas las notas de todos los alumnos 
 * @author Nestor Sanchez
 */

public class Notas {

	/**
	 * notasAlumno: se encarga de mostrarte las notas de cada alumno y todas sus asignaturas
	 * @param notas[]: notas de un alumno
	 */
	public static void notasAlumno(int notas[][]) {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Alumno " + i + ": " + Arrays.toString(notas[i]));
		}
	}
	
}
