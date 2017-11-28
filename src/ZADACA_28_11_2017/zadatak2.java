package ZADACA_28_11_2017;

import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
		System.out.println("Unesi broj studenata:");
		int brojstudenata=unos.nextInt();
		
		String[]imena=new String[brojstudenata];
		
		int[]ocjene=new int[brojstudenata];
		
		//unijet niz imena, niz ocjena
	
		System.out.println("Unesi ime studenta pa ocjenu:");
		for (int i=0;i<brojstudenata;i++){
			imena[i]=unos.next();
			ocjene[i]=unos.nextInt();
		}
		
		sortiraneocjene(imena,ocjene);
		
		for (int i=0;i<brojstudenata;i++){
			System.out.println(imena[i]+" "+ocjene[i]);
		}
		
		
		unos.close();
		
	}
		//haj sad ih sortiraj
		
		public static void sortiraneocjene(String[] imena, int[] ocjene) {
	        
			// traženje najveæe
			
			for(int i = ocjene.length - 1; i >= 1; i--) {
	            String temp;
	            
	            int najvecaocjena = ocjene[0];
	            int indexnajvece = 0;
	            for(int j = 1; j <= i; j++) {
	                if (najvecaocjena > ocjene[j]) {
	                    najvecaocjena = ocjene[j];
	                    indexnajvece = j;
	                }
	            }   
	        // ime uz index ocjene
	                if (indexnajvece != i) {
	                    temp = imena[indexnajvece];
	                    imena[indexnajvece] = imena[i];
	                    imena[i] = temp;
	                    ocjene[indexnajvece] = ocjene[i];
	                    ocjene[i] = najvecaocjena;
	                }
					
			}
		
		}		
	
}	
	
	
	
	

