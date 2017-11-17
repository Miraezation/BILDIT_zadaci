package ZADACA_15_11_2017;

public class zadatak4 {

	public static void main(String[] args) {
		
		int brojac=0;
	
		
		for (int i=2; i<10000; i++){
			if ( isPrime(i) && isPrime(i+2)){
				brojac++;
			if (brojac%10==0){
				System.out.println(i+" "+(i+2)+"|");}
			else
				System.out.print(i+" "+(i+2)+"|");
				}
			}
	}
		
		
		
	
	
			
					

	
	
	
	public static boolean isPrime(int n){
		
		boolean prost=true;
	
		for (int i=2; i<n; i++){
			if (n%i==0){
				prost=false;
				
			}
			
		}
		return prost;		
		
	}
	
	}