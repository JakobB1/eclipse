package edunova.koristenjemetoda;

public class PrimjerUvjetnoI {
	
	public static void main(String[] args) {
		if(provjera1() & provjera2()) {
			
		}
		System.out.println();
		
		if(provjera1() && provjera2()) {
			
		}
		System.out.println();
	}
	
	private static boolean provjera1() {
		System.out.print(" Provjera 1 ");
		return false;
	}
	
	private static boolean provjera2() {
		System.out.print(" Provjera 2 ");
		return false;
	}

}
