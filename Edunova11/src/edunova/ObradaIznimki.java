package edunova;

import java.util.Scanner;

public class ObradaIznimki {
	
	public ObradaIznimki() {
		Scanner ulaz = new Scanner(System.in);
		
		
		int i=0;
		while(true) {
			System.out.print("Daj broj: ");
			try {
				i = Integer.parseInt(ulaz.nextLine());
				break;
			}catch(NumberFormatException e) {
				System.out.println("Nisi mi dao cijeli broj");
			}

		}
				
		System.out.println(i);
		
		
		ulaz.close();
	}
	
	public static void main(String[] args) {
		new ObradaIznimki();
	}

}
