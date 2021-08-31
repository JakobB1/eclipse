package edunova.zadaci;

public class Zadatak03 {
	
	// Kreirajte metodu razlika tipa int koja
	// prima dva parametra tipa String
	// Metoda vraæa razliku prvog i drugog primljenog broja
	
	private static int razlika(String a, String b) {
		int a1= Integer.parseInt(a);
	    int b1= Integer.parseInt(b);
	    int rez= a1 - b1;
	    
	    return rez;
	}
	
	public static void main(String[] args) {
		
		int c = Zadatak03.razlika("10", "7");
		
		System.out.println(c);
	}
}