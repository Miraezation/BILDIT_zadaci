package ZADACA_10_11_2017;

import java.util.Scanner;

public class zadatak5 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
	System.out.println(" Upiši neki string???");
	String reko=unos.nextLine();
	
	char slovo=0;
	
	
	for (int i=0; i<=reko.length(); i++){
		slovo=reko.charAt(i);
		if (reko.indexOf(slovo)==reko.lastIndexOf(slovo)){
			System.out.println(" Prvi neponavljajuæi karakter u ovom stringu je: " +slovo);
			break;
		}
	}
	unos.close();

	}

}
