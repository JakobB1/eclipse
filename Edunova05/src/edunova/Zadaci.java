package edunova;

import javax.swing.JOptionPane;

public class Zadaci {

	public static void main(String[] args) {

		// Program uèitava 5 decimalnih brojeva u niz
		// Program ispisuje prvi i posljednji element niza
		float[] decimalni = new float[5];

		decimalni[0] = Float.parseFloat(
				JOptionPane.showInputDialog("Prvi decimalni")
				);
		decimalni[1] = Float.parseFloat(
				JOptionPane.showInputDialog("Drugi decimalni")
				);
		decimalni[2] = Float.parseFloat(
				JOptionPane.showInputDialog("Treci decimalni")
				);
		decimalni[3] = Float.parseFloat(
				JOptionPane.showInputDialog("Cetrvti decimalni")
				);
		decimalni[4] = Float.parseFloat(
				JOptionPane.showInputDialog("Peti decimalni")
				);
		
		System.out.println("Prvi broj je " + decimalni[0] + " a zanji je " + decimalni[4]);
		
		// Drugi nacin
		float[] dec = {
				Float.parseFloat(JOptionPane.showInputDialog("dec1")),
				Float.parseFloat(JOptionPane.showInputDialog("dec2")),
				Float.parseFloat(JOptionPane.showInputDialog("dec3")),
				Float.parseFloat(JOptionPane.showInputDialog("dec4")),
				Float.parseFloat(JOptionPane.showInputDialog("dec5"))
		};

		System.out.println(dec[0] + " - " + dec[4]);

		// Program preko args parametara prima dva cijela broja
		// Program ispisuje zbroj primljenih brojeva

		// Korisnik unosi cijeli broj
		// Program ispisuje broj 7 jedno ispod drugog
		// onoliko puta koliko je korisnik unio
		int cijeliBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Cijeli broj"));
		
		for(int i=0; i<cijeliBroj; i++) {
			System.out.println(7);
		}

		// program ispisuje sve parne brojeve od 1 do 55
		// U petlji obavezno koristiti vrijednosti 1 i 55

		/*
		 * //loše rješenje public static void main(String[] args) { for(int
		 * i=2;i<=54;i+=2) { System.out.println(i); } }
		 */

		// Program unosi 5 cijelih brojeva u niz
		// Program ispisuje najveæi uneseni broj
		

		
	}
}
