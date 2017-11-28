package ZADACA_27_11_2017;

import java.util.Arrays;
import java.util.Scanner;


public class zadatak5 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		int[]mojniz=new int[5];
	
		System.out.println("Unesi 5 brojeva...");
		for (int i=0;i<5;i++){
			mojniz[i]=unos.nextInt();
		}
		
		
		System.out.println("Najveæi zajednièki djelilac za unešeni niz je "+nzd(mojniz)+".");
		
		

		unos.close();
	
	}

	public static int nzd(int[] niz){
		
		int djelitelj = 0;
		int najveciunizu=najveci(niz);
		Arrays.sort(niz);
		
		petlja:
		for (int i=najveciunizu;i>0;i--){
			for (int j=0;j<5;j++){
				if (niz[j]%i!=0)
				continue petlja;
				
	
					
			}		
			djelitelj=i;
			break;
		
		}
		return djelitelj;
		
			

	}	

	
	public static int najveci(int[] niz){
		
		int najveci=niz[0];
		
		for (int i=0;i<niz.length;i++){
			if (niz[i]>najveci){
				najveci=niz[i];
			}
		}
		return najveci;
}		
	
}	
