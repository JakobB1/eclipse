package edunova.koristenjemetoda;

import javax.swing.JOptionPane;

public class Ulaz {
	
	 static int ucitajBroj(int min, int max) {
		int i;
		while(true) {
			i = Integer.parseInt(
					JOptionPane.showInputDialog("Daj broj"));
			if(i>min && i<=max) {
				return i; //short cuircuting
			}
		}
		
	}

}
