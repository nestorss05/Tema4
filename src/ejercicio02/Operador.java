package ejercicio02;

import java.util.Arrays;

// Clase Operador
public class Operador {

	// Funcion maximo: devolvera el numero maximo de todos los indices del array t
	public static int maximo(int t[]) {
		
		// int respuesta: valor maximo de la tabla t que se devolvera al main
		int respuesta = 0;
		
		// Vamos a comprobar el numero mayor de una forma muy peculiar:
		// Se ordenara la tabla, y se cogera el ultimo indice como numero mayor
		Arrays.sort(t);
		respuesta = t[t.length-1];
		
		// Devuelve respuesta al main
		return respuesta;
		
	} // Fin funcion maximo
	
} // Fin Clase Operador