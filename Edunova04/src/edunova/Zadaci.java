package edunova;

import javax.swing.JOptionPane;

public class Zadaci {

	public static void main(String[] args) {

		// Zadatak 1
		// korisnik unosi cijeli broj
		// za parni broj se ispisuje Osijek
		// za neparni broj se ispisuje Donji Miholjac

		int a;

		a = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));

		if (a % 2 == 0) {
			System.out.println("Osijek");
		} else {
			System.out.println("Donji Miholjac");
		}

		// Zadatak 2
		// Program unosi dva cijela broja od korisnika
		// program ispisuje veci uneseni broj

		int b, c;

		b = Integer.parseInt(JOptionPane.showInputDialog("Prvi cijeli broj"));

		c = Integer.parseInt(JOptionPane.showInputDialog("Drugi cijeli broj"));

		if (b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

		// Zadatak 3
		// Program unosi tri cijela broja od korisnika
		// program ispisuje najmanji uneseni broj

		int d, e, f;

		d = Integer.parseInt(JOptionPane.showInputDialog("Upisi prvi broj"));

		e = Integer.parseInt(JOptionPane.showInputDialog("Upisi drugi broj"));

		f = Integer.parseInt(JOptionPane.showInputDialog("Upisi treci broj"));

		if (d < e && d < f) {
			System.out.println(d);
		} else if (e < f ) {
			System.out.println(e);
		} else {
			System.out.println(f);
		}

		// Zadatak 4 - primitivni kalkulator
		// Korisnika unosi prvo operaciju:
		// 1 - zbrajanje
		// 2 - oduzimanje
		// 3 - množenje
		// 4 - djeljenje
		// za sve ostale unose program ispisuje: GREŠKA i završava se
		// Korisnik unosi dva decimalna broja
		// U odnosu na odabranu operaciju program ispisuje rezultat
		// Ako je rezultat cijeli broj tada se ispisuje bez .0

		int op;
		float zbrajanje;
		float oduzimanje;
		float mnozenje;
		float dijeljenje;
		float br1;
		float br2;

		br1 = Float.parseFloat(JOptionPane.showInputDialog("Unos prvog decimalnog broja"));

		br2 = Float.parseFloat(JOptionPane.showInputDialog("Unos drugog decimalnog broja"));

		op = Integer.parseInt(JOptionPane.showInputDialog("Unos operacije"));

		zbrajanje = br1 + br2;
		oduzimanje = br1 - br2;
		mnozenje = br1 * br2;
		dijeljenje = br1 / br2;

		if (op == 1) {
			if (zbrajanje == (int) zbrajanje)

				System.out.println("zbrajanje");

		} else if (op == 2) {
			if (oduzimanje == (int) oduzimanje)

				System.out.println("oduzimanje");

		} else if (op == 3) {
			if (mnozenje == (int) mnozenje)

				System.out.println("mnozenje");

		} else if (op == 4) {
			if (dijeljenje == (int) dijeljenje)

				System.out.println("dijeljenje");

		}

		if (op < 1 || op > 4) {
			System.out.println("GRESKA");

		}

		// Zadatak 5
		// Program unosi dva cijela broja.
		// U sluèaju da je zbroj unesenih brojeva veæi od 10
		// i razlika prvog i drugog manja od 0 program ispisuje
		// Osijek, inaèe ispisuje Donji Miholjac.

		int broj1, broj2;

		broj1 = Integer.parseInt(JOptionPane.showInputDialog("Prvi cijeli broj"));

		broj2 = Integer.parseInt(JOptionPane.showInputDialog("Drugi cijeli broj"));

		if (a + b > 10 && a + b < 0) {
			System.out.println("Osijek");
		} else {
			System.out.println("Donji Miholjac");

		}
	}
}