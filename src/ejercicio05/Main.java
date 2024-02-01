package ejercicio05;

/**
 * Clase principal donde se llamaran a las demas funciones
 * 
 * @author Nestor Sanchez
 */
public class Main {

	/**
	 * Funcion donde se creara el array, se llamaran a las demas funciones y donde
	 * se mostrara la tabla
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// int[][] tabla: array donde se guardaran los valores aleatorios generados
		int[][] tabla = new int[4][5];
		
		// int sumaTotal: suma total de los elementos del array
		int sumaTotal = 0;
		
		// int sumaFila: suma de las filas del array
		int sumaFila = 0;
		
		// int sumaColumna: suma de las columnas del array
		int sumaColumna = 0;
		
		// Genera los numeros  aleatorios
		Sumandos.generarSumandos(tabla);
		
		// For each: Suma las filas
		for (int[] fila : tabla) {
			sumaFila = 0;
			for (int valor : fila) {
				System.out.print(valor + "\t");
				sumaFila += valor;
			}
			System.out.println(sumaFila);
		} // Fin for each
		
		// For: suma las columnas y el total
		for (int j = 0; j < tabla[0].length; j++) {
			sumaColumna = 0;
			for (int i = 0; i < tabla.length; i++) {
				sumaColumna += tabla[i][j];
			}
			sumaTotal += sumaColumna;
			System.out.print(sumaColumna + "\t");
		} // Fin for
		
		// Muestra la suma total
		System.out.println(sumaTotal);

	}

}
