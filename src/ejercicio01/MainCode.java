package ejercicio01;

import java.util.Arrays;

/**
 * Clase en la que se asignaran valores a una tabla bidimensional
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * NUM[]: tabla bidimensional de 3 de alto y 6 de largo
	 */
	public static final int NUM[][] = new int[3][6];
	
	/**
	 * Codigo donde se ejecutara todo el codigo
	 * @param args
	 */
	public static void main(String[] args) {
		
		// num[][]: array bidimensional que guardara numeros
		
		
		// Asigna los valores pedidos a los respectivos indices
		NUM[0][0] = 0;
		NUM[0][1] = 30;
		NUM[0][2] = 2;
		NUM[0][5] = 5;
		NUM[1][0] = 75;
		NUM[1][4] = 0;
		NUM[2][2] = -2;
		NUM[2][3] = 9;
		NUM[2][5] = 11;
		
		// Muestra el array por pantalla
		System.out.print(Arrays.deepToString(NUM));
		
	}

}
