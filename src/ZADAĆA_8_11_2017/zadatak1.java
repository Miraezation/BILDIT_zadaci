package ZADA�A_8_11_2017;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
	System.out.println("Program �e izra�unat' kol'ko �e� u�tedit para ako je godi�nja kamata 5%.");

	System.out.println(" Kol'ko bi para ti ulag'o?");
	double pare=unos.nextInt();
	System.out.println(" I nakon kol'ko mjeseci bi ti to diz'o???");
	double mjeseci=unos.nextInt();
	double kamata=0.05/12;
	double sum=0;
	
	for ( int i=1; i<=mjeseci; i++){
			sum=(sum+pare)*(1+kamata);
	}
	System.out.printf(" Za "+ mjeseci + " mjeseci bi ti u�tedio %.2f KM.",sum);
	
	unos.close();
	
}
}