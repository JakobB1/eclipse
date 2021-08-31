package edunova;

public class Zadatak01 {
	
	// pomoæu while petlje ispišite sve parne brojeve
	// od 3 do 22 uz iznimku brojeva 8 i 10 (njih ne treba ispisati)
	
	
	public static void main(String[] args) {
		int i=3;
		while(i<=22) {
			if(i%2==0 && !(i==8 || i==10)) {
				System.out.println(i);
			}
			i++;
		}
	}

}
