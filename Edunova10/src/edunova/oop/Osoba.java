package edunova.oop;

// sve klase (htjele ili ne) nasljeđuju Object (paket java.lang)
public class Osoba /* extends Object */{
	
	private int sifra;
	private String ime;
	private String prezime;
	
	// tkz. prazni konstruktor
	public Osoba() {
		
	}
	
	// tkz. puni konstruktor - prima sva svojstva klase
	public Osoba(int sifra, String ime, String prezime) {
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
	}
	
	
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	@Override /* ovo je anotacija - uputa 3rd party library što èiniti*/
	public String toString() {
		return this.ime + " " + this.prezime;
	}
	
	
	public String predstaviSe() {
		return "g." + this.prezime;
	}
	
	
}
