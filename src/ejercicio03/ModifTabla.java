package ejercicio03;

/**
 * ModifTabla: clase donde se modifica y se muestra la tabla
 * @author Nestor Sanchez
 */
public class ModifTabla {

	/**
	 * rellenaTabla: rellenara la tabla con 10*(i+j)
	 * @param tabla
	 * @return la tabla rellena
	 */
	public static int[][] rellenaTabla (int tabla[][]) {
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = 10*(i+j);
			}
		}
		return tabla;
		
	} // Fin Funcion rellenaTabla
	
	/**
     * imprimirTabla: Imprime una matriz de la tabla
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
    }
}
