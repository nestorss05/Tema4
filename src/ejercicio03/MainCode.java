package ejercicio03;

/**
 * Clase principal: creara el array y enlazara funciones
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * final int tabla[][]: tabla que se rellenara con numeros
	 */
	public static final int TABLA[][] = new int[5][5];
	
	/**
	 * Creara una tabla de 5x5, y enlazara a las funciones de rellenar e imprimir
	 * tabla
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ModifTabla.rellenaTabla(TABLA);
		ModifTabla.imprimirTabla(TABLA);

	} // Fin Main

}
