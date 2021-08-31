package edunova;

public class K01_Metode {
	
	//1. vrsta metode
	// tipa void, ne prima parametre
	// tip void znaèi da ne vraæa vrijednost
	//tijelo metode
	/* package scope */ void ispis() {
		System.out.println("1. vrsta metode");
		System.out.println("Hello");
	}
	
	//2. vrsta metode
	//tipa void, prima parametre
	// potpis metode: naziv + lista parametara
	public void ispis(String ime) {
		System.out.println("2. vrsta metode");
		int i = this.slucajniBroj();
		System.out.println(ime + " " + i);
	}
	
	//3. vrsta metode
	// odreðenog tipa podatka, ne prima parametre
	private int slucajniBroj() {
System.out.println("3. vrsta metode");
		return 2;
	}
	
	//4. vrsta metode 
	// odreðenog tipa, prima parametre - najèešæa
	protected int zbroj(int i, int j) {
		System.out.println("4. vrsta metode");
		return i+j;
	}
	
	// 5. vrsta: konstruktor
	public K01_Metode() {
		System.out.println("U konstruktoru");
	}
	
	public static void posao() {
		System.out.println("Statièna metoda");
	}

}
