package edunova.koristenjemetoda;

import javax.swing.JOptionPane;

public class Start {
	
	public static void main(String[] args) {
		/*
		int i;
		while(true) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Daj broj"));
			if(i>0 & i<=5) {
				break;
			}
		}
		System.out.println(i);
		
		while(true) {
			i=Integer.parseInt(JOptionPane.showInputDialog("Daj broj"));
			if(i>5 && i<=10) {
				break;
			}
		}
		System.out.println(i);
		*/
		int i = Ulaz.ucitajBroj(0, 5);
		System.out.println(i);
		i=Ulaz.ucitajBroj(5, 10);
		System.out.println(i);
		
	}

}
