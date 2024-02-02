package ejercicio06;

/**
 * En esta clase se llamaran a las demas funciones y se iran asignando
 * continuamente
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Llama a las demas funciones y muestra las posiciones mas bajas y mas altas
	 * por pantalla
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] tabla = new int[6][10];
		int[] posiciones = new int[2];

		tabla = ModifTabla.generarNumeros(tabla);
		posiciones = ModifTabla.numerosMayorMenor(tabla, posiciones);
		System.out.println("Numero menor: " + posiciones[0]);
		System.out.println("Numero mayor: " + posiciones[1]);
	}

}
