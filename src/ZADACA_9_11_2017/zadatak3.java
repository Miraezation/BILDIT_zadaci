package ZADACA_9_11_2017;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {

	Scanner unos=new Scanner(System.in);
	
	System.out.println(" Dati su vam novèiæi u vrijednosti od 1, 3 i 5 maraka.");
	System.out.println(" Program raèuna najmanji broj novèiæa koji treba vam treba isplatiti.");
	
	System.out.println(" Kolko para hoæeš???");
	int para=unos.nextInt();
	
	int broj5=para/5;
	int broj3=(para%5)/3;
	int broj1=(((para%5)/3)%3);
	
	int brojkovanica=broj5+broj3+broj1;
	
	System.out.println("Treba ti " + brojkovanica + " novèiæ/a...");
		
		unos.close();
		
	}
	

	}


