package ZADACA_9_11_2017;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {

		
	Scanner unos=new Scanner(System.in);
	
	System.out.println(" De upiši neki string: ");
	String reko=unos.nextLine();
	
	char slovo;
	double brojacV=0;
	double brojacM=0;
	double brojacSlovo=0;
	int i=0;
	
	
	
	for (i=0; i<reko.length(); i++){
		slovo=reko.charAt(i);
		if (Character.isLetter(slovo))
			brojacSlovo++;
		if ( Character.isLowerCase(slovo)){
			brojacM++;}
		else if ( Character.isUpperCase(slovo)){
			brojacV++;}
	}
		double procenatV=(brojacV/brojacSlovo)*100;
		double procenatM=(brojacM/brojacSlovo)*100;
		
		System.out.println("Procenat malih slova u vašem stringu je "+procenatM+"%,a procenat velikih "+procenatV+"%.");
		
	unos.close();
		
			
		}
			
	}
	


	


