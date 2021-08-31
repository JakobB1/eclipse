package edunova;

import javax.swing.JOptionPane;

public class Zadatak05 {
	
	public static void main(String[] args) {
		
	// Program od korisnika unosi dva parna broja
	// Program ispisuje njohov zbroj
	
	int a,b;
	
	for(;;) {
		a = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi jedan parni br")
				);
		
		if (a % 2 == 0) {
			break;
		}
		
		JOptionPane.showMessageDialog(null, "Nisi unio parni broj");
	}
	
	for(;;) {
		b = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi jedan parni br")
				);
		
		if (b % 2 == 0) {
			break;
		}
		
		JOptionPane.showMessageDialog(null, "Nisi unio parni broj");
	}
	
	int sum = a + b;
			
	}
}
