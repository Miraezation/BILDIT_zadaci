package ZADACA_15_11_2017;

public class zadatak3 {

	public static void main(String[] args) {
		
		int i=11;
		
		while (i<100){
			if (isPrime(i) && isPrime(obrnuti(i)) && !palindrom(i)){
				System.out.print(i +" ");
			}
				
			i++;
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

	public static int obrnuti(int n){
		
		int cifra=(int) n;
		int brojobrnuto=0;
		
		
		while(cifra>0){
			brojobrnuto=brojobrnuto*10;
			brojobrnuto=brojobrnuto+cifra%10;
			cifra=cifra/10;
		}
		
		return brojobrnuto;	
	}
	
		public static boolean palindrom(int broj){
			
			if (broj==obrnuti(broj)){
				return true;}
			else
			return false;
			
		}
}