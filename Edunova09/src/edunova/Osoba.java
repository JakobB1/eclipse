package edunova;

// klasa je opisnik objekta
public class Osoba {
	
	//OOP princip uèahurivanja
	//Klasa æe uèahuriti (sakriti) svoja svojstva
	private String ime;
	
	//konstruktor
	// izvršava se pri izvoðenju dijal koda ... new ...
	public Osoba() {
		ime="Marko";
	}

	
	//i uèiniti ih dostupna putem javnim get set metoda
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
	

}
