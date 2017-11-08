package ZADAÆA_8_11_2017;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		
	Scanner unos=new Scanner(System.in);
	
	System.out.println(" Unesi neki cijeli broj od 10 do 123456789. ");
	int broj=unos.nextInt();
	
	int zadnji=0;
	int cifre=broj;
	
	while(cifre!=0){
		zadnji=cifre%10;
		cifre=cifre/10;
		
		System.out.print(zadnji);
	}

	unos.close();
	}

}
