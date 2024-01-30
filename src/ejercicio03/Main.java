package ejercicio03;

/**
 * Clase principal: creara el array y enlazara funciones
 * @author Nestor Sanchez
 */
public class Main {

	/**
	 * Creara una tabla de 5x5, y enlazara a las funciones de rellenar e imprimir
	 * tabla
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int tabla[][] = new int[5][5];
		ModifTabla.rellenaTabla(tabla);
		ModifTabla.imprimirTabla(tabla);

	} // Fin Main

}
