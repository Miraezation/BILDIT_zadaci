package ZADACA_13_11_2017;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {

		Scanner unos=new Scanner(System.in);
		
		System.out.println(" Ovaj program æe ti brojat karaktere u stringovima");
		System.out.println(" De upiši string:");
		String reko=unos.nextLine();
		System.out.println(" I koje æemo slovo brojat???");
		char slovo=unos.next().charAt(0);
		
		System.out.println(" U stringu " + reko + " karakter " + slovo + " se ponavlja " + brojacKaraktera(reko, slovo) + " puta.");
		
		unos.close();
	}
	
	public static int brojacKaraktera(String str, char ch){
		
		int brojac=0;
		
		for (int i=0;i<str.length();i++){
			char slovce=str.charAt(i);
			if (slovce==ch){
				brojac++;}
			
			}
		
	return brojac;
		
	}

}
