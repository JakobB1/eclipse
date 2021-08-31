package edunova;

import edunova.koristenjemetoda.Ulaz;

public class K02_MetodeStart {
	
	public static void main(String[] args) {
		
		// m je varijabla
		// ispravnije je reæi da je m varijabla instance
		K01_Metode m = new K01_Metode();
		
		// poziv metode
		m.ispis();
		m.ispis("Edunova");
		System.out.println(m.zbroj(2, 3));
		
		K03_Primjer p = new K03_Primjer();
		p.postaviGodine(28);
		p.ispisiGodine();
		
		K03_Primjer.VRIJEDNOST=7;
		System.out.println(K03_Primjer.VRIJEDNOST);
		
		K03_Primjer.VRIJEDNOST=8;
		System.out.println(K03_Primjer.VRIJEDNOST);
		
		// ne pristupati putem varijable
		m.posao();
		
		//veæ pozivati putem klase
		K01_Metode.posao();
	
		
		
		
	}

}
