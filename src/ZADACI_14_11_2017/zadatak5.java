package ZADACI_14_11_2017;

import java.util.Scanner;

public class zadatak5 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
		System.out.println(" Kolko æemo milisekundi pretvarat u sahate, minute i sekunde???");
		long broj=unos.nextLong();
		
		System.out.println(pretvoriMilisekunde(broj));
		
		unos.close();
	}

	
	public static String pretvoriMilisekunde(long millis){
		
		long sekunde=millis/1000;
		long sadsekundi=sekunde%60;
		long sadminuta=(sekunde/60)%60;
		long sadsati=(sekunde/3600)%24;
		
		return sadsati+":"+sadminuta+":"+sadsekundi;
		
		
	}	
}
