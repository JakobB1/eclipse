package edunova.primjer2;

import javax.swing.JOptionPane;

public class Program {

	private Mjesto mjesto;

	public Program() {
		mjesto = new Mjesto();
		ucitajMjesto();
		ispisiDetalje();
	}
	
	private void ispisiDetalje() {
		// ispiši broj stanovnika mjesta

		// ispiši naziv mjesta

		// ispiši naziv županije

	}

	private void ucitajMjesto() {
		mjesto.setNaziv(JOptionPane.showInputDialog("Unesi naziv mjesta"));
		mjesto.setBrojStanovnika(Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stanovnika")));
		mjesto.setZupanija(ucitajZupaniju());
	}

	private Zupanija ucitajZupaniju() {
		Zupanija zupanija = new Zupanija();

		zupanija.setNaziv(JOptionPane.showInputDialog("Unesi naziv županije"));
		zupanija.setZupan(JOptionPane.showInputDialog("Unesi župana"));

		return zupanija;
	}

	public static void main(String[] args) {
		new Program();
	}

}
