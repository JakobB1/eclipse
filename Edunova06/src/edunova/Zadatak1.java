package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//Program unosi 2 broja i ispisuje zbroj
	
	public static void main(String[] args) {
		
		int a,b,c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		c = a+b;
		
		System.out.println(c);
	}
	
	
}
