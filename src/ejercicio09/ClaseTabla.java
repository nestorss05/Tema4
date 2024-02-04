package ejercicio09;

/**
 * Se comprobara si la tabla es simetrica o no y se mostrara la tabla
 * 
 * @author Nestor Sanchez
 */
public class ClaseTabla {

	/**
	 * Se comprobara si la tabla es magica o no
	 * 
	 * @param tabla: tabla a analizar si es magica o no
	 * @return si la tabla es magica o no
	 */
	public static boolean esMagica(int[][] tabla) {
		boolean resultado = true;
		int fijarSuma = tabla[0][0] + tabla[0][1] + tabla[0][2] + tabla[0][3];

		// Comprueba las sumas horizontalmente
		for (int i = 1; i < tabla.length; i++) {
			if ((tabla[i][0] + tabla[i][1] + tabla[i][2] + tabla[i][3]) != fijarSuma) {
				resultado = false;
				break;
			}
		}

		// Comprueba las sumas vericalmente
		if (resultado) {
			for (int j = 0; j < tabla[0].length; j++) {
				for (int i = 0; i < tabla.length; i++) {
					if ((tabla[0][j]+tabla[1][j]+tabla[2][j]+tabla[3][j]) != fijarSuma) {
						resultado = false;
						break;
					}
				}
			}
		}
		
		return resultado;
	} // Fin funcion esMagica

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