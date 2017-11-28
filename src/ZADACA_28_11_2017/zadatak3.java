package ZADACA_28_11_2017;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
		double[][]resetka=new double[3][4];
		
		System.out.println("De unesi vrijednosti tabele 3 sa 4, red po red...");
		
		for (int i=0;i<3;i++){
			for (int j=0;j<4;j++){
				resetka[i][j]=unos.nextDouble();
			}
		}
		
		
		System.out.println("Vaša matrica je:");
		
		for (int i=0;i<3;i++){
			for (int j=0;j<4;j++){
				System.out.print(resetka[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------------------------");
	System.out.println("Suma kolone 0 je " +sumirajKolonu(resetka, 0));
	System.out.println("Suma kolone 1 je " +sumirajKolonu(resetka, 1));
	System.out.println("Suma kolone 2 je " +sumirajKolonu(resetka, 2));
	System.out.println("Suma kolone 3 je " +sumirajKolonu(resetka, 3));
	
	
	unos.close();
	
	}

	
	public static double sumirajKolonu(double[][]niz, int kolona){
		
		double sum=0;
		
			for (int red = 0; red < 3; red++) {
				sum += niz[red][kolona];
		}
	
		return sum;
	}
}
		
	


