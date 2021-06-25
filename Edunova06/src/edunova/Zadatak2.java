package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	public static void main(String[] args) {

		// program od korisnika unosi 2 decimalna broja
		// ispisuje veæi
		
		float a,b;
		
		a = Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi dec broj"));
		b = Float.parseFloat(JOptionPane.showInputDialog("Unesi drugi dec broj"));
		
		if (a>b) {
			System.out.println(a);
		} else { 
			System.out.println(b);
		}
	}
}
