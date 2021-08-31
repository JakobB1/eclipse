package edunova;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K06_Objekt {
	
	public static void main(String[] args) {
		
		// objekt je instanca klase
		// instanca se konstruira kljuènom rjeèju new
		String s  = new String("Pero");
		//ekvivalent String s="Pero";
		
	
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesi ime: ");
		String ime = ulaz.nextLine();
		
		System.out.println("Ime je dugačko: " + ime.length());
		
		//uvijek na graju princip: clean as you go
		ulaz.close();
		
	}

}
