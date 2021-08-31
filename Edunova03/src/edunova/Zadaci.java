package edunova;

import javax.swing.JOptionPane;

public class Zadaci {
	
	public static void main(String[] args) {
		
		// zadatak 1
		// deklarirajte varijablu za pohranu tjelesne
		// temperature covjeka kao int i dodjelite 
		// vrijednost 36
		int tjelesnaTemperatura=36;
		
		System.out.println(tjelesnaTemperatura);
		
		// zadatak 2
		// deklarirajte varijablu za temperaturu
		// mjesta kao int i dodjelite 
		// vrijednost -9. Ispisite deklariranu vrijednost
		int temperaturaMjesta=-9;
		System.out.println(temperaturaMjesta);
		
		// zadatak 3
		// Korisnik ucitava dva cijela broja
		// prpgram ispisuje njivog zbroj
		int prviBroj, drugiBroj, zbroj;
		
		prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Upiši prvi broj")
				);
		
		drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Upiši drugi broj")
				);
		
		zbroj = prviBroj + drugiBroj;
		
		System.out.println("Zbroj brojeva je " + zbroj);
		
		// zadatak 4
		// Program od korisnika ucitava tri broja
		// program ispisuje zbroj prvog i treceg
		// podjeljen s drugim unesenim brojem
		
		int a, b, c;

		a = Integer.parseInt(
				JOptionPane.showInputDialog("Upiši prvi broj")
				);

		b = Integer.parseInt(
				JOptionPane.showInputDialog("Upiši drugi broj")
				);

		c = Integer.parseInt(
				JOptionPane.showInputDialog("Upiši treci broj")
				);

		float zbroj1 = (float) (a + c) / b;

		System.out.println("Zbroj prvog i treceg broja podijeljen sa drugim brojem je " + zbroj1);
		
		// zadatak 5
		// Korisnik unosi dvoznamenkasti broj
		// Program ispisuje prvu znamenku
		
		int broj;

		broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi dvoznamenkasti broj"));

		System.out.println("Prva znamenka je " + (broj / 10));
		
		// Zadatak za zagrijavanje 
        // Program od korisnika ucitava jedan cijeli
		// i jedan decimalni broj
		// Program ispisuje zbroj dva ucitana broja
		
		
		int d; 
		double e;
		
		d = Integer.parseInt(
				JOptionPane.showInputDialog("Upiši cijeli broj")
				);
		
		e = Double.parseDouble(
				JOptionPane.showInputDialog("Upiši decimalni broj")
				);
		
		System.out.println(d + e);
		
		
		
	}

}
