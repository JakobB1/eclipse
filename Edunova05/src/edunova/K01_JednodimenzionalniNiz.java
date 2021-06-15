package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class K01_JednodimenzionalniNiz {

	public static void main(String[] args) {
		int sijecanjTemperatura = 12;
		// neæemo iæi s 12 varijabli za mjesece

		// deklaracija niza tipa podatka int naziva temp
		int[] temp;

		// inicijalizirati (konstruirati)
		temp = new int[12];

		// dodjeljivanje vrijednosti - index kreæe od 0
		temp[0] = -2; //sijeèanj
		temp[5]=22; //lipanj
		
		System.out.println(temp);
		System.out.println(Arrays.toString(temp));
		
		//druge sintakse
		int niz[] = new int[5];

		System.out.println(Arrays.toString(niz));
		
		niz[1]=348;
		System.out.println(niz[1]);
		
		//deklaracija i dodjeljivanje
		int[] brzo = {2,3,5,6,7,4,3};
		
		System.out.println(Arrays.toString(brzo));
		
		
	}
}
