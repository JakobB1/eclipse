package edunova;

public class K3_InlineIf {

	public static void main(String[] args) {
		
		int i=4;
		
		if(i==4) {
			System.out.println("OK");
		}else {
			System.out.println("NE");
		}
		
		
		// tercijarni operator ?
		System.out.println(i==4 ? "OK" : "NE");
		
		int j=2;
		System.out.println(i==4 ? "OK" : 
			j==2 ? "DA" : "NE");
		
	}
}
