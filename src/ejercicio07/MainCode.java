package ejercicio07;

/**
 * Clase donde se llamaran a las otras funciones y dodne se creara el array
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Funcion donde se iran llamando a las demas funciones y donde se generara la
	 * tabla
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] tabla = new int[4][4];
		ModifTabla.generarNumeros(tabla);
		ModifTabla.alterarOrden(tabla);
		ModifTabla.imprimirTabla(tabla);

	}

}
