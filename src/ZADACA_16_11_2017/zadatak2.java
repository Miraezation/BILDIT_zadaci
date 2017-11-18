package ZADACA_16_11_2017;

import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {

		Scanner unos=new Scanner(System.in);
		
		System.out.println("De unesi šta, neki string");
		String reko=unos.nextLine();
		System.out.print("Koje æemo slovo uklonit iz ovog stringa???");
		String slovo=unos.next();
		
		char deovo=slovo.charAt(0);
		
		System.out.println(" Vaš string \" " + reko + " \" bez karaktera " + slovo + " je: ");
		System.out.print(ukloniKarakter(reko, deovo));
		
		unos.close();
		
		
		
		
		
		
	}
	
	public static String ukloniKarakter(String str, char ch){
		
		return str.replaceAll(ch + "" , "");
		
			
		}
	}


