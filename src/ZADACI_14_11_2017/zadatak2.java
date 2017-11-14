package ZADACI_14_11_2017;

import java.util.Scanner;

public class zadatak2 {

	
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		
		System.out.println(" Unesi neki cijeli broj:");
		int broj=unos.nextInt();
		
		System.out.println("Zbir cifara tog broja je " +  saberiCifre(broj));
		unos.close();
	}
	
	public static int saberiCifre(long n){
		
		int cifra=(int) n;
		int sum=0;
		int zadnji=0;
		
		while(cifra>0){
			zadnji=cifra%10;
			sum+=zadnji;
			cifra=cifra/10;
		}
		
		return sum;
		
		
		
	}

}
