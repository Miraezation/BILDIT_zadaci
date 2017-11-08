package ZADAÆA_8_11_2017;

import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {

	Scanner unos=new Scanner(System.in);
	
	System.out.println(" Unesi niz cijelih brojeva, što pozitivnih, što negativnih, s tim da 0 prekida unos.");
	double broj=unos.nextDouble();

	double brojacP=0;
	double brojacN=0;
	double sum=0;
	double prosjek=0;
	
	while(broj!=0){
		
		sum=sum+broj;
		
		if (broj>0){
			brojacP++;}
		
		if (broj<0){
			brojacN++;}
		
		
		prosjek=sum/(brojacP+brojacN);
		broj=unos.nextDouble();
		}

	System.out.println(" Vi ste unijeli " + brojacP + " pozitivnih, a "+brojacN+" negativnih brojeva.");
	System.out.println(" Suma ovih brojeva je " + sum + ", a njihov prosjek je "+prosjek);
		
	
		unos.close();
	}
	}


