package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak06 {
	
	public static void main(String[] args) {
		
	// Program unosi 10 cijelih brojeva od korisnika
	// u jednodimenzionalni niz
	// Program ispisuje sve elemente niza
	
	int[] niz = new int[10];
	
	for(int i=0; i<10; i++) {
		niz[i] = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
	}

	System.out.println(Arrays.toString(niz));
}
}
