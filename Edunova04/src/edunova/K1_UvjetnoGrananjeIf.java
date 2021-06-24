package edunova;

public class K1_UvjetnoGrananjeIf {

	public static void main(String[] args) {

		int i = 0;

		// if je binarno uvjetno grananje
		// dva su moguæa ishoda

		// if radi s boolean tipom podatka

		boolean uvjet = i > 5;

		System.out.println(uvjet);

		// minimalna forma if naredbe
		if (uvjet) {
			System.out.println("i je veæe od 5");
		}

		// èešæe se piše
		if (i == 0) {
			System.out.println("i je 0");
		}

		// loša praksa
		if (i == 1)
			System.out.println("loša praksa");
		System.out.println("Druga linija");

		// puna forma if naredbe
		if (i == 0) {
			System.out.println("OK");
		} else {
			i = i + 1;
			System.out.println(i);
		}
		
		int j=2;
		// primjer else if naredbe
		if(j==0) {
			i=5;
		}else if(j==1) {
			i=6;
		}else {
			i=7;
		}
		
		System.out.println(i);

	}

}
