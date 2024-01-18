package ejercicio04;

// Clase Busqueda
public class Busqueda {
	
	// Funcion buscar:
	public static int buscar(int t[], int clave) {
		
		// int respuesta: respuesta dada a base de la localizacion de la clave
		int respuesta = 0;
		
		// int indice: indice de busqueda
		int indice = 0;
		
		// If: Busca la clave en el array y guardala en respuesta
		while (indice < t.length && clave != t[indice]) {
			indice++;
		} // Fin While
		
		// If-Else: si el indice es menor a la longitud de la tabla:
		if (indice < t.length) {
			respuesta = indice;
		} else {
			// Si no es asi, respuesta sera -1
			respuesta = -1;
		} // Fin If-Else
				
		// Devuelve respuesta al main
		return respuesta;
		
	} // Fin Funcion buscar
	
} // Fin Clase Busqueda