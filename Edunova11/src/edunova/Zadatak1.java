package edunova;

public class Zadatak1 {
	
	// Za unesena dva cijela broja ispiši zbroj
	public Zadatak1() {
		
		System.out.println(
				Ulaz.ucitajCijeliBroj("Unesi prvi broj", 
						"Nisi unio cijeli broj")
				+
				Ulaz.ucitajCijeliBroj("Unesi drugi broj", 
						"I drugi broj mora biti cijeli")
				);
		
	}
	public static void main(String[] args) {
	 new Zadatak1();	
	}

}
