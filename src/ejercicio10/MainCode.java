package ejercicio10;

/**
 * Codigo principal del Ejercicio 10
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Se iran enlazando a las respectivas funciones de ModifTabla
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] tablaInicio = new int[4][4];
		ModifTabla.generarNumeros(tablaInicio);
		ModifTabla.alterarOrden(tablaInicio);
		ModifTabla.imprimirTabla(tablaInicio);
		
	}

}
