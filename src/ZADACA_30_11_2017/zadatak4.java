package ZADACA_30_11_2017;

import java.util.Arrays;
import java.util.Scanner;

public class zadatak4 {
	
	
	public static void main(String[] args) {

		Scanner unos=new Scanner(System.in);
		
		System.out.println("Kolko æemo redova?");
		int red=unos.nextInt();
		
		System.out.println("A kolko kolona?");
		int kolona=unos.nextInt();
		
		double [][] matrica=new double[red][kolona];
		
		System.out.println("De unesi vrijednosti te matrice, red po red:");
		for (int i=0;i<red;i++){
			for (int j=0;j<kolona;j++){
				matrica[i][j]=unos.nextDouble();	
			}
		}
		
		for (int i=0;i<red;i++){
			for (int j=0;j<kolona;j++){
				System.out.print(matrica[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("index najveceg je "+Arrays.toString(najveci(matrica)));
		
		unos.close();
	}
	
	
	public static int[] najveci(double[][]matrica){
		
		int [] temp=new int[2];
		double najveci=0;
		
		
		for (int i=0; i<matrica.length;i++){
			for (int j=0; j<matrica[i].length; j++){
				if (matrica[i][j]>najveci){
					najveci=matrica[i][j];
					temp[0]=i;
					temp[1]=j;
				}
			}
		}
		return temp;
	}

}
