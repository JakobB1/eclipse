package edunova;

import javax.swing.JOptionPane;

public class Ulaz {
	
	public static int ucitajCijeliBroj(String poruka, String greska) {
		while(true) {
			try {
				return Integer.parseInt(
						JOptionPane.showInputDialog(poruka)
						);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, greska);
			}
		}
	}
	
	//zadatak: Kreirajte metodu ucitajDecimalniBroj
	//zadatak: Kreirajte metodu ucitajString koja garantira da je 
	// uèitan minimalno 1 znak

}
