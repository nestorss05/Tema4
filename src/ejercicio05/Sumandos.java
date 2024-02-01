package ejercicio05;

/**
 * Clase que trata de mostrar y rellenar la tabla de numeros aleatorios
 * 
 * @author Nestor Sanchez
 */
public class Sumandos {

	/**
	 * Rellena la tabla de numeros aleatorios
	 * @param tabla
	 * @return la tabla con los numeros aleatorios
	 */
	public static int[][] generarSumandos(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int) ((Math.random() * 899) + 100);
			}
		}
		return tabla;
	}

}
