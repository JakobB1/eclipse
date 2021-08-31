package edunova;


// klasa ima moguænost pamtiti stanje
public class K03_Primjer {
	
	public static int VRIJEDNOST;
	
	//konstanta
	public static final int AKCIJA=1;
	
	// varijabla godine na razini klase
	 int godine;
	
	public void postaviGodine(int godine /*varijabla godine kao parametar metore*/) {
		this.godine=godine;
	}
	
	public void ispisiGodine() {
		System.out.println(godine);
	}

}
