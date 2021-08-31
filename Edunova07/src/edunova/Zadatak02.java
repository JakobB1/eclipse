package edunova;

public class Zadatak02 {

	public static void main(String[] args) {

		// s pomoću do while petlje zbrojite prvih 100 brojeva
		// ispišite rezultat
		
		int i = 0;
		int sum = 0;
		
		do {
			sum +=i;
		} while (++i <=100);
		
		System.out.println(sum);
	}
}