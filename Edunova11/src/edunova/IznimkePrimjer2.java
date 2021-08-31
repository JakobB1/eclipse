package edunova;

public class IznimkePrimjer2 {
	
	public IznimkePrimjer2() {
		int[] niz = new int[3];
		
		try {
			niz[3]=5;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ne postoji element niza");
		}catch(Exception e) {
			System.out.println("Iznimka: " + e.getMessage());
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new IznimkePrimjer2();
	}

}
