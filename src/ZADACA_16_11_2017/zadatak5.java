package ZADACA_16_11_2017;

import java.util.Scanner;

public class zadatak5 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
		System.out.println(" De unesi stranicu kvadrata???");
		double stranica=unos.nextDouble();
		
		System.out.println("Površina tvog kvadrata je "+povrsina(stranica)+", a obim "+obim(stranica)+".");

		unos.close();
		
	}
	
	public static double obim(double n){
		
		double obim=4*n;
		return obim;
		
	}
	
	public static double povrsina(double n){
		
		double povrsina=n*n;
		return povrsina;
	}

}
