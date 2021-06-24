package edunova;

public class K02_DoWhile {
	
	public static void main(String[] args) {
		
		int t=15;
		for(int i=20;i<t;i++) {
			System.out.println("Osijek");
		}
		
		while(t>20) {
			System.out.println("Edunova");
		}
		
		//osigurava minimalno jedno izvoðenje
		do {
			System.out.println("Java");
		}while(t>20);
		
	}

}
