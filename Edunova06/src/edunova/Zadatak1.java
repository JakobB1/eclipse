package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {

		// Program unosi 2 broja i ispisuje zbroj
		
		int a,b,c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		c = a + b;
		
		System.out.println(c);		
	}
}