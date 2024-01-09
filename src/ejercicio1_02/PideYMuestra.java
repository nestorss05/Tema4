package ejercicio1_02;

public class PideYMuestra {

	// Clase PideYGuarda
	public static void PideYGuarda(double numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Inserta un numero");
			numeros[i] = Main.sc.nextDouble();
		}
	} // Fin Clase PideYGuarda
	
	// Clase MuestraTabla
	public static void MuestraTabla(double numeros[]) {
		// For: Recorre la tabla mostrando su numero respectivo
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		} // Fin For
	} // Fin Clase MuestraTabla
	
}
