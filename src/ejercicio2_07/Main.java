package ejercicio2_07;

import java.util.Arrays;

//Clase Main
public class Main {

	// Funcion Main
	public static void main(String[] args) {

		// Crea las dos tablas para tu tablilla de numeros y para la tablilla ganadora
		int tusNumeros[] = new int[6];
		int numeroGanador[] = new int[6];

		// numerosGanadores: cantidad de numeros ganadores
		byte numerosGanadores = 0;

		// Genera numeros aleatorios en cada array
		for (int i = 0; i < tusNumeros.length; i++) {
			tusNumeros[i] = (int) ((Math.random() * 49) + 1);
		} // Fin For 1

		for (int i = 0; i < numeroGanador.length; i++) {
			numeroGanador[i] = (int) ((Math.random() * 49) + 1);
		} // Fin For 2

		// Ordena la tabla de la combinacion ganadoa
		Arrays.sort(numeroGanador);

		// Comprueba si los dos arrays son iguales
		if (Arrays.equals(tusNumeros, numeroGanador)) {
			System.out.println("Has ganado la loteria, GG");
			numerosGanadores = 6;
		} else {
			// En este caso, procederemos a buscar cada acierto
			for (int numeros : tusNumeros) {
				if (Arrays.binarySearch(numeroGanador, numeros) >= 0) {
					numerosGanadores++;
				}
			}
		} // Fin If-Else

		// Muestra al usuario los resultados
		System.out.println("Tu combinacion: " + Arrays.toString(tusNumeros));
		System.out.println("Combinacion ganadora: " + Arrays.toString(numeroGanador));
		System.out.println("Aciertos: " + numerosGanadores);

	} // Fin Funcion Main

} // Fin Clase Main
