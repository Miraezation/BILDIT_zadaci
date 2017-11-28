package ZADACA_27_11_2017;

import java.util.Arrays;

public class zadatak4 {

	public static void main(String[] args) {
		
		int[]mojniz={9,9,1,1,2,3,4,2,5,6,7,7,8,8,8};
		
		int[]bezduplih=ukloniDuplikate(mojniz);
		
		Arrays.sort(bezduplih);
		
		System.out.println("Jedinstveni brojevi iz unesenog niza su:");
		for (int i=0;i<bezduplih.length;i++){
			if(bezduplih[i]!=0){
				System.out.print(bezduplih[i]+" ");
			}
		}

	}

	
	public static int[] ukloniDuplikate (int[]niz){
		
		int[]tempniz=new int[niz.length];
		
		for (int i=0;i<niz.length;i++){
			boolean dupli=false;
				for (int j=0;j<i;j++){
					if (niz[i]==niz[j]){
						dupli=true;
						break;
					}
				}
				if (dupli==false){
					tempniz[i]=niz[i];
				}
		}
		return tempniz;
	}
}