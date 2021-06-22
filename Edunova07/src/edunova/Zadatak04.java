package edunova;

public class Zadatak04 {
	
	public static void main(String[] args) {
		
		// Ulaz je ime i prezime 
		// Izlaz email adresa u Edunovi
		
		// primjer: Tomislav Jakopec -> tjakopec@edunova.hr
		
		String ime = "Tomislav Jakopec";
		String[] imeIprezime = ime.split(" ");
		String email="";
		
		email=imeIprezime[0].substring(0,1).toLowerCase()+imeIprezime[1].toLowerCase();
		
		System.out.println(email + "@edunova.hr");
	}

}
