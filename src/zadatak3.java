package ZADACA_13_11_2017;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {

		Scanner unos=new Scanner(System.in);
		
	System.out.println(" De upiši kakav string...");
	String reko=unos.nextLine();
	
	System.out.println(" String ima " + prebrojiSlova(reko) + " slova....");
	
	unos.close();
	}
	
	
	
	public static int prebrojiSlova(String s){
		
		int brojac=0;
		
		for (int i=0; i<s.length(); i++){
			char slovo=s.charAt(i);
			if (Character.isLetter(slovo)){
				brojac++;
			}
		}
		return brojac;
	}

}
