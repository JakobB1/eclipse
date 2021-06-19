package edunova;

import javax.swing.JOptionPane;

public class Zadatak9 {

	// Program od korisnika unosi brojeve
	// sve dok korisnik ne unese broj 0
	// Program ispisuje zbroj svih unesenih brojeva

	public static void main(String[] args) {

		int a;
		int sum = 0;

		for (;;) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			if (a == 0) {
				break;
			}
			sum = sum+a;
		}
		System.out.println(sum);

	}

}
