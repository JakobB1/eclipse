package edunova;

public class Zadatak03 {
	
	public static void main(String[] args) {
		
		//ulaz u program je niz znakova koji sadrzi
		//imena gradova razdvojeno zarezom
		//Program ispisuje naziv grada koji u sebi ima najmanje znakova
		
		//Primjer ulaza: "Osijek, Zagreb, Varazdin, Sinj, Donji Miholjac"
		//Sinj
		
		String s = "Osijek, Zagreb, Varazdin, Sinj , Donji Miholjac";
		String[] gradovi = s.split(",");
		int najmanji= Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<gradovi.length;i++) {
			if(gradovi[i].trim().length()<najmanji) {
				najmanji = gradovi[i].trim().length();
				index=i;
			}
		}
		System.out.println(gradovi[index].trim());
		
	}
}
