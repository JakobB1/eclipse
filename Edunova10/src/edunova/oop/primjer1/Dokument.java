package edunova.oop.primjer1;

public class Dokument {
	
	private int id;
	private double iznos;
	private String datum;
	
	public Dokument() {
		
	}
	
	
	public Dokument(int id, double iznos, String datum) {
		super();
		this.id = id;
		this.iznos = iznos;
		this.datum = datum;
	}
	
	
	public int getid() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) {
		this.iznos = iznos;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	
	

}
