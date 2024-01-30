package ejercicio04;

/**
 * Clase principal donde se llamaran a las demas funciones
 * @author Nestor Sanchez
 */
public class Main {

	/**
	 * Funcion donde se creara el array y se llamaran a las demas funciones
	 * @param args
	 */
	public static void main(String[] args) {
		
		int tabla[][] = new int[10][10];
		ModifTabla.tablaMultiplicar(tabla);
		ModifTabla.imprimirTabla(tabla);
		
	} // Fin Clase Main

}
