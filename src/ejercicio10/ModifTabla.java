package ejercicio10;

/**
 * Funciones para complementar el main del Ejercicio 10
 * 
 * @author Nestor Sanchez
 */
public class ModifTabla {

	/**
	 * Funcion que rellenara la tabla
	 * 
	 * @param tabla tabla vacia
	 * @return la tabla rellenada
	 */
	public static int[][] generarNumeros(int[][] tabla) {
		int contadorNumeros = 0;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				contadorNumeros++;
				tabla[i][j] = contadorNumeros;
			}
		}
		return tabla;
	} // Fin Funcion generarNumeros

	/**
	 * En esta funcion se girara la tabla 90 grados
	 * 
	 * @param tabla: tabla ordenada
	 * @return tabla girada 90 grados
	 */
	public static int[][] alterarOrden(int[][] tabla) {

		int[][] tablaOG = tabla;
		int restando = 0;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = tablaOG[3][i]-restando;
				restando=restando+tabla[i].length;
			}
			restando = 0;
		}
		return tabla;

	} // Fin Funcion alterarOrden

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
	} // Fin clase imprimirTabla

}