package edunova;

public class Zadatak8 {

	// Program ispisuje matricu 15 x 15
	// tako da je svaki element matrice broj 0

	public static void main(String[] args) {

		int a = 15, b = 15;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(0);
			}
			System.out.println();
		}

	}

}