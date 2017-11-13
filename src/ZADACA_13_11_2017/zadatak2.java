package ZADACA_13_11_2017;

public class zadatak2 {

	public static void main(String[] args) {

	System.out.println(" Svi prosti brojevi od 1 do 10000.");
	
	for (int i=2; i<=10000;i++){
		if (isProstiBroj(i)){
			System.out.println(i + " ");
		}
	}
	}

	public static boolean isProstiBroj(int broj){
		
		boolean isProstiBroj=true;
		
				
		for (int i=2;i<broj;i++){
			if(broj%i==0){
					isProstiBroj=false;
					break;}
			
				
			}
		return isProstiBroj;
			
	}
		
	}
