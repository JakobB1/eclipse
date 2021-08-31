package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class K05_StringKlasa {

	public static void main(String[] args) {
		
		// String je klasa - nije primitivni tip
		String s;
		//https://www.javatpoint.com/immutable-string
		s="Osijek";
		
		System.out.println(s.hashCode());
		
		s+=" 1";
		
		System.out.println(s.hashCode());
		
		//String pb = JOptionPane.showInputDialog("Unesi b1");
		//String db = JOptionPane.showInputDialog("Unesi b2");
		//string concatenation
		//System.out.println(pb+db);
		
		// čitanje dokumentacije
		
		// ime = JOptionPane.showInputDialog("ime");
		String ime="Osijek";
		System.out.println(ime);
		System.out.println(ime.length());
		System.out.println(ime.substring(1));
		System.out.println(ime.substring(1,3));
		
		float r = 2000/(float)3;
		
		System.out.println(r);
		
		String rez = String.valueOf(r);
		
		System.out.println(rez);
		
		System.out.println(rez.indexOf("."));
		
		System.out.println(rez.substring(rez.indexOf(".")+1));
		
		String pojam = "2,3,4,3,2,3,3";
		System.out.println(pojam.indexOf(",", 5));
		for(int i=0;i<pojam.length();i++) {
			System.out.println(pojam.charAt(i));
		}
		
		String[] niz = pojam.split(",");
		System.out.println(Arrays.toString(niz));
		
		int suma=0;
		for(String e: niz) {
			suma+=Integer.parseInt(e);
		}
		System.out.println(suma);
		
	}
}
