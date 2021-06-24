package edunova;

import java.util.Arrays;

public class K03_NizStringovaArgs {
	
	/*
	 * 
	 E:\JP24\eclipse\Edunova05>cd bin

E:\JP24\eclipse\Edunova05\bin>java edunova.K03_NizStringovaArgs
[]

E:\JP24\eclipse\Edunova05\bin>java edunova.K03_NizStringovaArgs prvi
[prvi]

E:\JP24\eclipse\Edunova05\bin>java edunova.K03_NizStringovaArgs prvi 3 4 kkr
[prvi, 3, 4, kkr]

E:\JP24\eclipse\Edunova05\bin>java edunova.K03_NizStringovaArgs prvi 3 4 kkr "Grad Osijek"
[prvi, 3, 4, kkr, Grad Osijek]

E:\JP24\eclipse\Edunova05\bin>
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		
	}
}
