package edunova;

import javax.swing.JOptionPane;

public class K05_JOptionPaneKlasa {
	
	public static void main(String[] args) {
		String s ="Pero";
		
		// ovo nije moguæe
		//JOptionPane j = "";
		
		// MOžemo s klase koristiti statiène metode
		if(JOptionPane.showConfirmDialog(null, "Sigurno?")
				==JOptionPane.OK_OPTION) {
			System.out.println("Kliknuo si OK");
		}
		
		// showConfirmDialog je statièna metoda
		// statiènim metoda pristupamo putem naziva klase pa .
		
		// pozvati mail metodu iz K01_While
		//K01_While.main(null);
	}

}
