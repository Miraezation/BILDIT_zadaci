package ZADACA_9_11_2017;

import java.util.Scanner;

public class zadatak5 {

	public static void main(String[] args) {
		
		
	Scanner unos=new Scanner(System.in);
	
	int brojacbroj=0;
	char karakter;
	int i=0;
	
	
	
	System.out.println(" Vaš password mora imati najmanje 8 karaktera.");
	System.out.println(" Mora sadržavati samo slova i brojeve.");
	System.out.println(" Mora sadržavati najmanje 2 broja.");
	System.out.println(" -----------------------------------------------");
	System.out.println(" Unesi željeni password:");
	String pass=unos.nextLine();
	
	
	
	
	
	if (pass.length()<8){
		System.out.println("Password nije validan, mora imat bar 8 karaktera.");}
	
	for (i=0; i<pass.length();i++){
		karakter=pass.charAt(i);
		if(!Character.isLetterOrDigit(karakter)){
			System.out.println("Password smije sadržavati samo brojeve ili slova.");
			break;}
	
	
		else if ( Character.isDigit(karakter)){
			brojacbroj++;}
	}
		
		if (brojacbroj<2){
			System.out.println("Password mora imati bar 2 broja!");}
		
		else
			
		System.out.println(" Unijeo si validan password ("+pass+").");
	
	
	}
}
	


	
			
		
		
			




	
	
	
	

	
	




