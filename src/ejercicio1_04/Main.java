package ejercicio1_04;

public class Main {

	public static void main(String[] args) {
		
		// Asigna la tabla
		int num[] = new int[12];
		
		// Se asignan los valores predeterminados
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		// For each: muestra cada elemento de la tabla
		for (int valor: num) {
			System.out.println(valor);
		} // Fin For each
		
	}

}
