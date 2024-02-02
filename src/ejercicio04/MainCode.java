package ejercicio04;

/**
 * Clase principal donde se llamaran a las demas funciones
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * final int tabla[][]: array que contendra la tabla de multiplicar
	 */
	public static final int TABLA[][] = new int[10][10];
	
	/**
	 * Funcion donde se llamaran a las demas funciones
	 * @param args
	 */
	public static void main(String[] args) {
		
		ModifTabla.tablaMultiplicar(TABLA);
		ModifTabla.imprimirTabla(TABLA);
		
	} // Fin Clase Main

}
