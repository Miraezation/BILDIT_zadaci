package ZADACA_10_11_2017;

import java.util.Scanner;


public class zadatak4 {

	public static void main(String[] args) {

		Scanner unos=new Scanner(System.in);
		
	System.out.println(" De upiši neki ASCII kod ( cijeli broj od 0 d0 127).");
	int broj=unos.nextInt();
	
	char slovo=(char)broj;
	
	System.out.println(" Taj ASCII kod odgovara karakteru : " + slovo);
	
	unos.close();
	}
	
}
