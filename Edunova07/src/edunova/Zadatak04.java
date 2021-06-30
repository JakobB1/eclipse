package edunova;

public class Zadatak04 {

	public static void main(String[] args) {

		// Ulaz je ime i prezime
		// Izlaz email adresa u Edunovi

		// primjer: Tomislav Jakopec -> tjakopec@edunova.hr
		
		String ime = "Jakob Brkić";
		String[] imePrezime = ime.split(" ");
		String email="";
		
		email = imePrezime[0].substring(0,1).toLowerCase()+imePrezime[1].toLowerCase();
		System.out.println(email + "@edunova.hr");
		
	}
}
