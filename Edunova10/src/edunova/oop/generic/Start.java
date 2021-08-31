package edunova.oop.generic;

import java.util.ArrayList;
import java.util.List;

public class Start {
	
	public Start() {
		
		// Lista je parametrizirana s generičkim parametrom tipa String
		// što znači da će lista moći sadržavati samo
		// instance klase String
		List<String> lista = new ArrayList<String>();
		lista.add("Edunova");
		//lista.add(22); // ne može
		
	}
	
	public static void main(String[] args) {
		new Start();
	}

}
