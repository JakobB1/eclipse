package edunova.oop.primjer2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Program {
	
	private List<Mobitel> mobiteli;
	
	public Program() {
		mobiteli = new ArrayList<Mobitel>();
		ucitajMobitele();
		ispisi();
	}
	
	private void ispisi() {
		for(Mobitel m: mobiteli) {
			System.out.println(m.getNaziv());
		}
		
	}

	private void ucitajMobitele() {
		Mobitel mobitel;
		while(true) {
			mobitel = new Mobitel();
			mobitel.setNaziv(JOptionPane.showInputDialog("Unesi naziv"));
			mobiteli.add(mobitel);
			if(JOptionPane.showInputDialog("Unesi K za kraj").equals("K")) {
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		new Program();
	}

}
