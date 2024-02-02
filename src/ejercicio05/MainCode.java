package ejercicio05;

/**
 * Clase principal donde se llamaran a las demas funciones
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * int[][] tabla: array donde se guardaran los valores aleatorios generados
	 */
	public static final int[][] TABLA = new int[4][5];
	
	/**
	 * Funcion donde se creara el array, se llamaran a las demas funciones y donde
	 * se mostrara la tabla
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		// int sumaTotal: suma total de los elementos del array
		int sumaTotal = 0;
		
		// int sumaFila: suma de las filas del array
		int sumaFila;
		
		// int sumaColumna: suma de las columnas del array
		int sumaColumna;
		
		// Genera los numeros  aleatorios
		Sumandos.generarSumandos(TABLA);
		
		// For each: Suma las filas
		for (final int[] fila : TABLA) {
			sumaFila = 0;
			for (final int valor : fila) {
				System.out.print(valor + "\t");
				sumaFila += valor;
			}
			System.out.println(sumaFila);
		} // Fin for each
		
		// For: suma las columnas y el total
		for (int j = 0; j < TABLA[0].length; j++) {
			sumaColumna = 0;
			for (int i = 0; i < TABLA.length; i++) {
				sumaColumna += TABLA[i][j];
			}
			sumaTotal += sumaColumna;
			System.out.print(sumaColumna + "\t");
		} // Fin for
		
		// Muestra la suma total
		System.out.println(sumaTotal);

	}

}
