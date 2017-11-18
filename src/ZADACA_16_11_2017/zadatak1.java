package ZADACA_16_11_2017;

public class zadatak1 {

	public static void main(String[] args) {
		
		
		format(3444,5);
		

	}

	
	public static String format(int number, int width){
		
	
	
		
		for (int i=1; i<=(width-brojcifara(number)); i++){
			if (brojcifara(number)>width){
				System.out.print(number);
				break;
			}
			System.out.print("0");}
		System.out.print(number);
		return null;
		}
			
		
		
	public static int brojcifara(int n){
		int brojac=0;
		
		
		while(n!=0){
			n=n/10;
			brojac++;
		
		
	}
		return brojac;
	}
}

