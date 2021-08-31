package edunova;

public class Start {
	
	// ŽIVOTNI VIJEK OBJEKTA
	// 1. objekt je zamišljen ali "ne živi" - vrijednost null
	private Osoba polaznik;

	public Start() {
		// osoba je objekt -- insnace variable
		// Objekt je instanca klase
		Osoba osoba = new Osoba(); // new poziva konstruktor

		System.out.println(osoba.getIme());

		// postavljanje vrijednosti
		osoba.setIme("Pero");

		// dohvaæanje vrijednosti
		System.out.println(osoba.getIme());
		
		zivotniVrijekObjekta();
		
	}

	private void zivotniVrijekObjekta() {
		System.out.println(polaznik);
		// nullpointer exception
		System.out.println(polaznik.getIme());
		//2. konstruiranje objekta
		polaznik = new Osoba();
		
		//3. radni vijek
		polaznik.setIme("Marija");
		System.out.println(polaznik.getIme());
		
		//4. uništenje
		// NE moramo brinuti o uništenju jer to radi GC (Garbage Collector)
		
		
	}

	public static void main(String[] args) {
		new Start();
	}

}
