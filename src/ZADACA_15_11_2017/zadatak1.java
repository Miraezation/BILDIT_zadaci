package ZADACA_15_11_2017;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {

		Scanner unos=new Scanner(System.in);
		
		System.out.println("Unesi tri broja da ti ih složim od najveæeg do najmanjeg.");
		double prvi=unos.nextDouble();
		double drugi=unos.nextDouble();
		double treci=unos.nextDouble();
		
		ispisiSortiraneBrojeve (prvi, drugi, treci);
	
		unos.close();
	}
	
		
		public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3){
			
			if (broj3>broj2 && broj2>broj1){
				System.out.println(broj1+" "+ broj2+ " " +broj3);}
			else if ( broj2>broj3 && broj3>broj1){
				System.out.println(broj1+" "+ broj3+ " " +broj2);}
			else if (broj3>broj1 && broj1>broj2){
				System.out.println(broj2+" "+ broj1+ " " +broj3);}
			else if (broj1>broj3 && broj3>broj2){
				System.out.println(broj2+" "+ broj3+ " " +broj1);}
			else if (broj1>broj2 && broj2>broj3){
				System.out.println(broj3+" "+ broj2+ " " +broj1);}
			else if (broj2>broj1 && broj3>broj2){
				System.out.println(broj3+" "+ broj1+ " " +broj2);}
			
		}
		
	}