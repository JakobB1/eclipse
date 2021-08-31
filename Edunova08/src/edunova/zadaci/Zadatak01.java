package edunova.zadaci;

public class Zadatak01 {
	
	// Kreirati metodu tipa int naziva suma 
	// koja prima niz cijelih brojeva
	// metoda vraæa sumu svih brojeva u nizu
	
	// Metodu pozvati iz main metode

	private static int suma(int[] brojevi) {
		int suma=0;
		for(int i: brojevi) {
			suma+=i;
		}
		return suma;
	}
	public static void main(String[] args) {
		int[] niz = {3,4,2,4,4,2,1};
		System.out.println(suma(niz));
	}
}