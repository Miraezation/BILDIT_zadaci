package ZADACA_30_11_2017;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
		System.out.println("Unesi dužinu niza pls:");
		int broj=unos.nextInt();
		
		
		int[]niz=new int[broj];
		
		System.out.println("Unesi èlanove niza:");
		for (int i=0; i<niz.length; i++){
			niz[i]=unos.nextInt();
		}
		
		if (jelsortiran(niz)){
			System.out.println("Niz je sortiran!");
		}
		else 
			System.out.println("Nije sortiran! NO WAI!");
		
		
		unos.close();

	}

	
	public static boolean jelsortiran(int[]niz){
		
		for (int i=1; i<niz.length;i++){
			if (niz[i-1]>niz[i]){
				return false;
			}
		}
		return true;
		
		
		
	}
}
