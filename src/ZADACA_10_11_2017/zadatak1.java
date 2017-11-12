package ZADACA_10_11_2017;

public class zadatak1 {

	public static void main(String[] args) {

		int zadnjacifra=0;
		int k=0;
		double sum=0;
		int i=0;
		
	for (i=1; i<1000; i++){
		
		k=i;
		
		while (k>0){
			
			zadnjacifra=k%10;
			sum=sum+Math.pow(zadnjacifra, 3);
			k=k/10;
		}
		
		if (sum==i){
			System.out.println(sum);
		}
		sum=0;
		}
		}
	
}
	


