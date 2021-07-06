package edunova.oop.generic;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public Start() {
		
		// Lista je parametrizirana s generièki parametrom tipa String
		// što znaèi da æe lista moæi sadržavati samo
		// instance klase String
		List<String> lista = new ArrayList<String>();
		lista.add("Edunova");
		//lista.add(22); // ne može
		
		
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
