package edunova;

import java.util.Arrays;

public class K02_VisedimenzionalniNizovi {
	
	public static void main(String[] args) {
		//dvodimenzionalni niz - tablica/matrica
		int[][] tablica=new int[3][3];
		
		tablica[0][0]=1;
		tablica[0][1]=0;
		tablica[0][2]=0;
	
		tablica[1][0]=0;
		tablica[1][1]=1;
		tablica[1][2]=0;
	
		tablica[2][0]=0;
		tablica[2][1]=0;
		tablica[2][2]=1;
		
		System.out.println(Arrays.deepToString(tablica));
	
		System.out.println(Arrays.toString(tablica[0]));
		System.out.println(Arrays.toString(tablica[1]));
		System.out.println(Arrays.toString(tablica[2]));
		
		
		
		// trodimenzionalni niz - kocka
		// koliko možemo elemenata pohraniti u ovom nizu?
		int[][][] kocka = new int[10][10][10];
		
		//ljudi percipiraju 4 dimenzije - 4. je vrijeme
		int[][][][] kockaUVremenu=new int[10][10][10][10];
		
		//5,6,7,... dimenzija SF
		
		
		// dvodimenzionalna skraæeno
		int[][] podaci = {
				{1,1,2,3},
				{5,4,7,2},
				{3,4,5,6}
		};
		//ispišite broj 7 pristupajuæi nizu
		System.out.println(podaci[1][2]);
	}

}
