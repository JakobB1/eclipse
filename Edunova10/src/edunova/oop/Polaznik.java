package edunova.oop;

// jedna klasa može naslijediti samo jednu nadklasu
// jedna klasa ne može naslijediti dvije različite klase
public class Polaznik extends Osoba {
	
	private String brojUgovora;
	
	public Polaznik() {
		
	}

	public Polaznik(int sifra, String ime, String prezime, String brojUgovora) {
		super(sifra, ime, prezime);
		this.brojUgovora = brojUgovora;
	}

	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.brojUgovora;
	}
	
	@Override
	public String predstaviSe() {
		return this.brojUgovora;
	}
	

}
