package ejercicio01;

// Clase Operador
public class Operador {

	// Funcion suma: devolvera la suma de todos los valores del array
	public static int suma(int numerosEnteros[]) {

		// int respuesta: resultado de la suma de todos los indices del array
		int respuesta = 0;

		// For: ve sumando cada indice del array y guardalo en la variable respuesta
		for (int i = 0; i < numerosEnteros.length; i++) {
			respuesta += numerosEnteros[i];
		} // Fin For

		// Devuelve la respuesta al main
		return respuesta;

	} // Fin Funcion suma

} // Fin Clase Operador