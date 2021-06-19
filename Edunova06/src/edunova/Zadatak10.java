package edunova;

public class Zadatak10 {

	// Ispiši Sve parne brojeve od 3 do 47

	public static void main(String[] args) {

		for (int i = 3; i < 47; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
