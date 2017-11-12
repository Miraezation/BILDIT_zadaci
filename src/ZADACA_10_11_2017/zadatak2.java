package ZADACA_10_11_2017;


import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		
	Scanner unos=new Scanner(System.in);
	
	System.out.println(" De unesi neki cijeli broj...");
	int broj=unos.nextInt();
	
		
		for (int j=1; j<=broj; j++){
		
			if (broj%j==0){
			
			System.out.println(" Faktor broja "+broj+" je " + j);
			
		}
	}
		unos.close();

	}

}
