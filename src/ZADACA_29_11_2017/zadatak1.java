package ZADACA_29_11_2017;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		
		int[]niz = new int[10];
		
		unesiniz(niz);
		
		bublajga(niz);
		
		for (int i=0;i<niz.length;i++){
			System.out.print(niz[i]+" ");	
		}
		

	}
	
	public static int[] unesiniz(int[]niz){
		
		System.out.println("Unesi 10 cijelih brojeva za niz:");
		
		for (int i=0; i<niz.length;i++){
			niz[i]=new Scanner(System.in).nextInt();
			
		}
		return niz;
	}
	
	public static boolean jelsortiran(int[]niz){
		
		for (int i=1; i<niz.length;i++){
			if (niz[i-1]>niz[i]){
				return false;
			}
		}
		return true;
	}
	
	
	public static void bublajga(int[]niz){
		
	
		int tempindex;

			
				for (int i=0;i<niz.length;i++){
					for (int j=1;j<niz.length-i;j++)
					if (niz[j-1]>niz[j]){
						tempindex=niz[j-1];
						niz[j-1]=niz[j];
						niz[j]=tempindex;
					}
				}
			}
		
				
			
	}


