package ZADACA_13_11_2017;

import java.util.Scanner;

public class zadatak5 {

	public static void main(String[] args) {

		Scanner unos=new Scanner(System.in);
		
	System.out.println(" Program pretvara stope u metre...");
	System.out.println(" Kolko stopa bi pretvaro???");
	double stope=unos.nextDouble();
	
	System.out.println(" Tolko stopa kolko si ti reko ti je "+ stopeUMetre(stope) + " metara...");
	
	unos.close();}
	
	public static double stopeUMetre(double stope){
		
		double metri=stope*0.305;
		
		return metri;
	}

}
