package edunova;

public class Zadatak07 {
	
	public static void main(String[] args) {
		
	// Prim broj je broj koji je cjelobrojno djeljiv sam s sobom
	// i s broj 1.
	// Za uneseni broj x = 27353 ispišite da li je prim broj
		
	int x = 273532542;
	boolean primBroj = true;
	for (int i = 2; i<x ; i++) {
		
		if (x % i ==0) {
			primBroj = false;
			break;
		}
	}
	if (primBroj) {
		System.out.println("Broj je prim");
	} else {
		System.out.println("Broj nije prim");
	}

	

}
}
