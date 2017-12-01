package ZADACA_29_11_2017;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
Scanner unos=new Scanner(System.in);
		
		//deklarisane dvije matrice 3x3
		double[][] matrica1=new double[3][3];
		double[][] matrica2=new double[3][3];
			
		System.out.println(" Unesi dvije matrice 3x3, red po red:");
		
		
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				matrica1[i][j]=unos.nextDouble();
			}
		}
			
		
		System.out.println(" I druga matrica");
		
		
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				matrica2[i][j]=unos.nextDouble();
			}
	
		}
		
		isprintajMatricu(matrica1);
		
		System.out.println("-----------");
		
		isprintajMatricu(matrica2);
	
		System.out.println("Rezultat množenja ove dvije matrice je:");
		
		double [][]pomnozene=pomnoziMatrice(matrica1,matrica2);
		
		isprintajMatricu(pomnozene);
		
		
		unos.close();
	
	}
	
	public static void isprintajMatricu(double [][]matrica){
		
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				System.out.print(matrica[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static double[][] pomnoziMatrice(double[][] a, double[][] b){
		
		double[][]temp=new double[3][3];
		
		
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
			
				  for (int k=0;k<3;k++){
				
				temp[i][j]+=(a[i][k]*b[k][j]);
				
						
				}
			}
		}	
		return temp;
	
	}
}