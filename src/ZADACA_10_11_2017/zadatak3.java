package ZADACA_10_11_2017;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
		
	Scanner unos=new Scanner(System.in);
	
	System.out.println(" Unesi neki string i gledaj magije...");
	String reko=unos.nextLine();
	
	for (int i=reko.length()-1; i>=0; i--){
		System.out.print(reko.charAt(i));
	}

		unos.close();
	}

}
