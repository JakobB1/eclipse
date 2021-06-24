package edunova;

import java.util.Arrays;

public class Zadatak03 {
	
	// Ulaz u program je niz znakova koji sadrži
	// imena gradova razdvojeno zarezom
	// Program ispisuje naziv grada koji u sebi ima najmanje znakova

	//Primjer ulaza: "Osijek, Zagreb, Varaždin, Sinj, Donji Miholjac"
	// Sinj
	
	public static void main(String[] args) {
		String s = "Osijek, Zagreb, Varaždin, Sinjski lug, Donji Miholjac";
		String[] gradovi = s.split(",");
		int najmanji=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<gradovi.length;i++) {
			if(gradovi[i].trim().length()<najmanji) {
				najmanji = gradovi[i].trim().length();
				index=i;
			}
		}
		System.out.println(gradovi[index].trim().toUpperCase());
		for(String grad: gradovi) {
			if(grad.trim().length()==najmanji) {
				System.out.println(grad.trim().toLowerCase());
			}
		}
		
	}
}
