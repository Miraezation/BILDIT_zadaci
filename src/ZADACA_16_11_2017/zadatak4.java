package ZADACA_16_11_2017;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {

		Scanner unos=new Scanner(System.in);
		
		System.out.println(" Koliko bacanja novèiæa treba izvršiti??? ");
		int broj=unos.nextInt();
		
		bacanje(broj);
		
		unos.close();
	}
	
	public static void bacanje(int n){
		
		int glava=0;
		int pismo=0;
		
	for (int i=1;i<=n;i++){
		int novcic=(int) (Math.random()*2+1);
		
	if (novcic==1){
		glava++;}
		else
		pismo++;
	}
	
	System.out.println(" Bacio sam ga "+n+" puta. I "+glava+" puta je bila glava, a "+pismo+" puta pismo.");
		
	}

}
