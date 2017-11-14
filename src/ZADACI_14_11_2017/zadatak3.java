package ZADACI_14_11_2017;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
		System.out.println(" De upiši broj da napravim toliki kvadrat.");
		int broj=unos.nextInt();
		
		printMatrix(broj);
		
		unos.close();
	}

	
	public static void printMatrix(int n){
		
		
				
		for (int i=1; i<=n;i++){
			for (int j=1; j<=n; j++){
				int broj=(int)(Math.random()*2);
				System.out.print(broj+" ");}
			System.out.println();}
		}
	}
	
