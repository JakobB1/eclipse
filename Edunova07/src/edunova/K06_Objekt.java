package edunova;

import java.util.Scanner;

public class K06_Objekt {
	
	public static void main(String[] args) {
		
		// objekt je istanca klase
		// instanca se konstruira kljucnom rjecju new
		String s = new String("Pero");
		// ekvivalent String s="Pero";
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesni ime: ");
		String ime = ulaz.nextLine();
		
		System.out.println("Ime je dugacko: " + ime.length());
		
		//uvijek na kraju princim: clean as you go 
		ulaz.close();
		
	}

}
