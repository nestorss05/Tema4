package ejercicio04;

/**
 * Clase que trata de mostrar y modificar la tabla
 * @author Nestor Sanchez
 */
public class ModifTabla {

	/**
	 * tablaMultiplicar: asigna valores i*j a los indices de cada array
	 * @param tabla: tabla 10x10 traida del Main
	 * @return: las tablas de multiplicar del 1 al 10
	 */
	public static int[][] tablaMultiplicar(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (i+1)*(j+1);
			}
		}
		return tabla;
	} // Fin clase tablaMultiplicar
	
	/**
     * imprimirTabla: Imprime una matriz de la tabla
     * @param tabla Matriz a imprimir
     */
    public static void imprimirTabla(int[][] tabla) {
        if (tabla.length == 0 || tabla[0].length == 0)
            return;

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.printf("%d ", tabla[i][j]);
            }
            System.out.printf("\n");
        }
    } // Fin clase imprimirTabla
	
}
