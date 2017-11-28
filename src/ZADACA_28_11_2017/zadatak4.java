package ZADACA_28_11_2017;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
		double[][]matrica=new double[4][4];
		
		System.out.println("Unesi vrijednosti matrice 4x4, red po red:");
		
		for (int i=0;i<4;i++){
			for (int j=0;j<4;j++){
				matrica[i][j]=unos.nextDouble();
			}
		}
		
		System.out.println("Vaša matrica je:");
		
		for (int i=0;i<4;i++){
			for (int j=0;j<4;j++){
				System.out.print(matrica[i][j]+" "+"|");
			}
			System.out.println("");
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Zbir silazne dijagonale vaše matrice je "+silaznaSuma(matrica));
		System.out.println("------------------------------------------------------");
		System.out.println("Zbir uzlazne dijagonale vaše matrice je "+uzlaznaSuma(matrica));
		System.out.println("------------------------------------------------------");
		
		
		unos.close();
	}
	
	public static double silaznaSuma(double[][]niz){
		
		double sum=0;
		
		for (int i=0; i<niz.length; i++){
			sum=sum+niz[i][i];
		}
		
		return sum;
	}

	public static double uzlaznaSuma(double[][]niz){
		
		double sum=0;
		
		for (int i=0;i<niz.length;i++){
				sum=sum+niz[i][niz.length-i-1];
			}
		
		return sum;
	}
}
