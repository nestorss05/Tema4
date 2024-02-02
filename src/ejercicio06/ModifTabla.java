package ejercicio06;

/**
 * Clase que trata de mostrar y rellenar la tabla de numeros aleatorios
 * 
 * @author Nestor Sanchez
 */
public class ModifTabla {

	/**
	 * int[][] tabla: tabla donde se guardaran valores aleatorios
	 */

	/**
	 * Rellena la tabla de numeros aleatorios
	 * 
	 * @param tabla
	 * @return la tabla con los numeros aleatorios
	 */
	public static int[][] generarNumeros(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int) (Math.random() * 1001);
			}
		}
		return tabla;
	} // Fin clase generarNumeros

	/**
	 * numerosMayorMenor: se elegiran los numeros mas grandes y mas pequeños
	 * respectivamente
	 * 
	 * @param tabla      tabla con los numeros
	 * @param posiciones posiciones vacias a rellenar por numeros
	 * @return las posiciones llenas
	 */
	public static int[] numerosMayorMenor(int[][] tabla, int[] posiciones) {
		int numeroMayor = 0;
		int numeroMenor = 1000;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (numeroMayor < tabla[i][j]) {
					numeroMayor = tabla[i][j];
				}
				if (numeroMenor > tabla[i][j]) {
					numeroMenor = tabla[i][j];
				}
			}
		}
		posiciones[0] = numeroMenor;
		posiciones[1] = numeroMayor;
		return posiciones;
	} // Fin clase numerosMayorMenor

}
