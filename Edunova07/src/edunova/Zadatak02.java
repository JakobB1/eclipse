package edunova;

public class Zadatak02 {

	public static void main(String[] args) {

		// s pomocu do while petlje zbrojite prvih 100 brojeva
		// ispisite rezultat

		int i = 0;
		int sum = 0;

		do {
			sum += i;
			i++;
		} while (++i <= 100);
		System.out.println(sum);

	}

}
