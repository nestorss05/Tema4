package ejercicio01;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		// num[][]: array bidimensional que guardara numeros
		int num[][] = new int[3][6];
		
		// Asigna los valores pedidos a los respectivos indices
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		// Muestra el array por pantalla
		System.out.print(Arrays.deepToString(num));
		
	}

}
