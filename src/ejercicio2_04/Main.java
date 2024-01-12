package ejercicio2_04;

import java.util.Arrays;

// Clase Main
public class Main {
	
	// Funcion Main
	public static void main(String[] args) {
		// numerosAleatorios: array donde se guardaran los numeros aleatorios
		int numerosAleatorios[] = new int[30];
		
		// For: genera numeros aleatorios y asignalos a la tabla
		for (int i=0; i<numerosAleatorios.length; i++) {
			numerosAleatorios[i] = (int) (Math.random()*10);
		} // Fin For
		
		// Ordena el array
		Arrays.sort(numerosAleatorios);
		
		// Muestra el array por pantalla
		System.out.println(Arrays.toString(numerosAleatorios));
	} // Fin Funcion Main

} // Fin Clase Main
