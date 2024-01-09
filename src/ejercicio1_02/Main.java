package ejercicio1_02;

import java.util.Scanner;

public class Main {
	
	// Inicia el Scanner
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Crea la tabla numeros
		double numeros[] = new double[5];		
		
		// Pide al usuario numeros del array
		PideYMuestra.PideYGuarda(numeros);
		
		// Muestra la tabla
		PideYMuestra.MuestraTabla(numeros);
		
		// Cierra el Scanner
		sc.close();
	}

}
