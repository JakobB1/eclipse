package edunova;

import javax.swing.JOptionPane;

public class Zadatak04 {

	public static void main(String[] args) {

		// Program uèitava cijele brojeve od korisnika
		// sve dok se ne uèita broj 0. Tada se program završava

		int x;
		for (;;) {
			x = Integer
					.parseInt(JOptionPane.showInputDialog("daj mi jedan broj,ako uneses nula" + ",program zavrsava"));

			if (x == 0) {
				break;
			}
		}
	}
}