package edunova;

import java.util.Arrays;

public class K03_ForEach {

	public static void main(String[] args) {
		int[] niz = {2,3,2,3,2,4,3};
		
		for(int i=0;i<niz.length;i++) {
			System.out.print(niz[i] + ",");
		}
		System.out.println();
		//foreach uvije treba jednu varijablu koja će sadržavati
		// pojedini element niza
		for(int i: niz) {
			System.out.print(i + ",");
		}
		
		
	}
}
