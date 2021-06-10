package edunova;

public class K2_IfOperatori {

	public static void main(String[] args) {
		
		int t=2, j=3;
		
		// operatori usporeðivanja i logièki
		// logièki AND
		if(t>=2 & j==3) {
			System.out.println("OK 1");
		}
		// & provjerava oba uvjeta
		
		
		// && u sluèaju da prvi uvjet nije zadovoljen
		// drugi se neæe provjeravati
		if(t>2 && j==3) {
			System.out.println("OK 2");
		}
		
		// logièki OR
		// | provjerava oba uvjeta
		if(t>2 | j==3) {
			System.out.println("OK 3");
		}
		
		// || u sluèaju da je zadovoljen prvi uvjet
		// ne provjerava se drugi
		if(t==2 || j<0) {
			System.out.println("OK 4");
		}
		
		// logièki NOT
		// !
		if(!(t==0 || j==3)) {
			System.out.println("OK 5");
		}
		
		//ovo nije potrebno
		if(!(t==3)) {
			System.out.println("OK 6");
		}
		
		//piše se
		if(t!=3) {
			System.out.println("OK 7");
		}
		
	
		
	}
}
