package ZADACA_15_11_2017;

public class zadatak5 {

	public static void main(String[] args) {
		int brojac=0;
		
	for (int i=100; i<100000;i++){
		if (isPrime(i) && palindrom(i)){
			brojac++;
			if (brojac%10==0){
			System.out.println(i+" ");}
			else 
			System.out.print(i+ " ");
			if (brojac==100){
				break;
			}
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
	
	public static int naopak(int n) {
		int broj = 0;
		while (n > 0) {
			broj=broj*10;
			broj=broj+n%10;
			n= n/10;
		}
		return broj;
	}

	public static boolean palindrom(int n){
		boolean jednak=true;
		
		if (n!=naopak(n)){
			jednak=false;}
			
		return jednak;
		}
		
	}

	



