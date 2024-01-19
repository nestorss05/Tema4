package ejercicio06;

// Clase Operador
public class Operador {

	// Funcion suma: sacara la suma de los resultados de los numElementos elementos
	// consecutivos de t
	public static int[] suma(int t[], int numElementos) {

		// int tFinal[]:
		int tFinal[] = new int[t.length-(numElementos-1)];
		
		int suma;
		
		// For 1: Genera numeros aleatorios del 1 al 10 en cada indice de t
		for (int i = 0; i < t.length; i++) {

			t[i] = (int) ((Math.random() * 10) + 1);

		} // Fin For 1
		
		// For 2: numElementos de los indices de t se iran sumando, poquito a poco
		for (int i = 0; i < tFinal.length; i++) {
			suma = 0;
			// For 2.1: escoge tres numeros a sumar que dependeran del valor de i
			for (int j = 0+i; j < numElementos+i; j++) {
				suma = suma + t[j];
			} // Fin For 2.1
			tFinal[i] = suma;
		} // Fin For 2

		// Devuelve tFinal al main
		return tFinal;

	} // Fin Funcion Suma

} // Fin Clase Operador