package edunova;

public class K1_ForBeskonacnaPetlja {
	
	public static void main(String[] args) {
		// Ovo nije beskonaèna petlja jer
		//Integer.MAX_VALUE + 1 nije veæe on 0
		for(int i=2;i>0;i++) {
			
		}
		
		//"prljava" beskonaèna petlja
		for(int i=2;i>0;i++) {
			i--;
		}
		
		// java sintaksa for beskonaène petlje
		for(;;) {
			
		}
	}

}
