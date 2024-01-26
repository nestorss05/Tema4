package ejercicio02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int notas[][] = new int[5][4];
		boolean pase = false;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<notas.length; i++) {
			for (int j = 0; j<notas[i].length; j++) {
				do {
					try {
						System.out.println("Inserta una nota");
						System.out.println("Alumno " + i);
						System.out.println("Asignatura " + j);
						notas[i][j] = sc.nextInt();
						if (notas[i][j] < 0 || notas[i][j] > 10) {
							System.out.println("ERROR: Nota fuera del rango");
						} else {
							pase = true;
						}
					} catch (InputMismatchException e) {
						System.out.println("ERROR: Respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!pase);
				pase = false;
			}
		}
		System.out.println(Arrays.deepToString(notas));
		sc.close();
	}

}
