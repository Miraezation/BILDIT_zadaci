package ZADACA_9_11_2017;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {

	Scanner unos=new Scanner(System.in);
	
	int brojacV=0;
	
	System.out.println(" Unesi neki string...");
	String reko=unos.nextLine();
	
	for (int i=0; i<reko.length();i++){
		char slovo=reko.charAt(i);
	if (Character.isUpperCase(slovo)){
		brojacV++;}
	}
	
	System.out.println(" U vašem stringu ima " + brojacV + " velikih slova...");
	
	
	unos.close();
	
	}
}

