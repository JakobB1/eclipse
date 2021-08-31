package edunova;

import javax.swing.JOptionPane;

public class Zadatak01 {

	public static void main(String[] args) {

		// Program unosi 2 broja i ispisuje zbroj

		int a, b, c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));

		c = a + b;

		System.out.println(c);

	}
}