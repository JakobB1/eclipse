package edunova;

import javax.swing.JOptionPane;

public class Zadaci {

	public static void main(String[] args) {
		// deklarirajte varijablu za pohranu tjelesne
		// temperature čovjeka kao int i dodjelite
		// vrijednost 36
		int tjelesnaTemperatura = 36;

		System.out.println(tjelesnaTemperatura);

		// deklarirajte varijablu za temperaturu
		// mjesta kao int i dodjelite
		// vrijednost -9. Ispišite deklariranu vrijednost
		int temperaturaMjesta = -9;

		System.out.println(temperaturaMjesta);

		// Korisnik učitava dva cijela broja
		// program ispisuje njihov zbroj

		int prviBroj, drugiBroj;

		prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));

		drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		System.out.println(prviBroj + drugiBroj);

		// program od korisnika učitava tri broja
		// program ispisuje zbroj prvog i trećeg
		// podjeljen s drugim unesenim brojem

		int a,b,c;
		
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
		
		System.out.println((a+c)/(float)b);
		
		// Korisnik unosi dvoznamenkasti broj
		// Program ispisuje prvu znamenku
		
		double k;
		
		k = Integer.parseInt(JOptionPane.showInputDialog("Unesi dvoznamenkasti broj"));
		
		System.out.println(k);
		

	}

}
