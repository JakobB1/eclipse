package edunova.oop;

public class Start {
	
	public Start() {
		Osoba osoba = new Osoba();
		osoba.setIme("Pero");
		osoba.setPrezime("Matkov");
		osoba.setSifra(1);
		System.out.println(osoba.toString());
		// ekvivalent 
		System.out.println(osoba);
		
		System.out.println(osoba.predstaviSe());
		
		
		Polaznik polaznik = new Polaznik();
		polaznik.setIme("Marija");
		polaznik.setPrezime("Zimska");
		polaznik.setSifra(1);
		polaznik.setBrojUgovora("2021/56");
		
		System.out.println(polaznik.predstaviSe());
		
		Predavac predavac = new Predavac();
		predavac.setSifra(1);
		predavac.setIme("Marin");
		predavac.setPrezime("Kartik");
		predavac.setZiroRacun("HR5265985523658512");
		
		System.out.println(predavac);
		
		// sljedeća linija je ekvivalent linijama 17 - 21
		Polaznik p1 = new Polaznik(1,"Ivan","Deklom","2021/57");
		
		Predavac pr = new Predavac(1,"Maja","Majić","HR56587484");
		
		System.out.println(p1);
		System.out.println(pr);
    }
	
	public static void main(String[] args) {
		new Start();
	}

}
