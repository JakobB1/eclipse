package edunova.oop.primjer1;

public class Racun extends Dokument {
	
	private Kupac kupac;
	
	
	public Racun() {
		
	}
	
	
	public Racun(int id, double iznos, String datum, Kupac kupac) {
		super(id, iznos ,datum);
		this.kupac = kupac;
	}
}