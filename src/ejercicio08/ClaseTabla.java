package ejercicio08;

/**
 * Se comprobara si la tabla es simetrica o no y se mostrara la tabla
 * 
 * @author Nestor Sanchez
 */
public class ClaseTabla {

	/**
	 * Se comprobara si la tabla es simetrica o no
	 * 
	 * @param tabla: tabla a analizar si es simetrica o no
	 * @return si la tabla es simetrica o no
	 */
	public static boolean esSimetrica(int[][] tabla) {
		boolean resultado = true;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] != tabla[j][i]) {
					resultado = false;
					break;
				}
			}
		}
		return resultado;
	} // Fin funcion esSimetrica

	/**
	 * imprimirTabla: Imprime una matriz de la tabla
	 * 
	 * @param tabla Matriz a imprimir
	 */
	public static void imprimirTabla(int[][] tabla) {
		if (tabla.length == 0 || tabla[0].length == 0) {
			return;
		}

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.printf("%d ", tabla[i][j]);
			}
			System.out.printf("\n");
		}
	} // Fin funcion imprimirTabla

}