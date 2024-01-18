package ejercicio05;

// Clase Busqueda
public class Busqueda {

	// Clase int[] buscarTodos: Buscara todos los indices de elementos donde haya un
	// valor en concreto
	public static int[] buscarTodos(int t[], int valor) {

		// int respuesta[]: tabla que guardara las posiciones donde esten el valor a buscar
		int respuesta[] = new int[t.length];
		
		// For: Se ira rellenando la tabla a medida de donde se encuentre el valor
		for (int i = 0; i < t.length; i++) {
			
			if (t[i] == valor) {
				respuesta[i] = valor;
			}
			
		} // Fin For
		
		// Devuelve respuesta al main
		return respuesta;
		
	} // Fin clase buscarTodos

} // Fin Clase Busqueda