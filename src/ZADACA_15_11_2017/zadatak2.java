package ZADACA_15_11_2017;

import java.util.Scanner;



public class zadatak2 {

	public static void main(String[] args) {

		Scanner unos=new Scanner(System.in);
		
		int brojac=0;
		
		System.out.println(" Koji broj te interesuje???");
		int broj=unos.nextInt();
		
		if (isPrime(broj)){
			System.out.println(broj + " je prost broj...");}
			else
			System.out.println(" Broj nije prost...");
			
		unos.close();
		
		System.out.println("--------------------------------------");
		System.out.println("Prosti brojevi su:");
			for (int i=2; i<=100000; i++){
				if(isPrime(i)){
					brojac++;
					if (brojac%10==0){
						System.out.println(i);}
						else
						System.out.print(i+" ");
						
					}
				
				}
			}
		
		
	
	
	public static boolean isPrime(int n){
		boolean prost=true;
		
		for (int i=2; i<n; i++){
			if (n%i==0){
				prost=false;
			}
			
		}
		return prost;
	}

}
