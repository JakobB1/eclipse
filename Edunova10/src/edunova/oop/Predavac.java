package edunova.oop;

public class Predavac extends Osoba{
	
	private String ziroRacun;
	
	
	public Predavac() {
		
	}

	
	
	public Predavac(int sifra, String ime, String prezime, String ziroRacun) {
		super(sifra, ime, prezime);
		this.ziroRacun = ziroRacun;
	}



	public String getZiroRacun() {
		return ziroRacun;
	}

	public void setZiroRacun(String ziroRacun) {
		this.ziroRacun = ziroRacun;
	}
	

}
