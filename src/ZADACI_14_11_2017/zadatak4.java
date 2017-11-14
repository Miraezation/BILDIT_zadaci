package ZADACI_14_11_2017;

public class zadatak4 {

	public static void main(String[] args) {

		tacnovrijeme();
		
	}
	
	public static void tacnovrijeme(){
		
		long milisekunde=System.currentTimeMillis();
		
		long sekunde=milisekunde/1000;
		
		long sadsekundi=sekunde%60;
		
		long minute=sekunde/60;
		
		long sadminuta=minute%60;
		
		long sati=minute/60;
		
		long sadsati=sati%24+1;
		
		System.out.println(" Sad je "+sadsati+" sati,"+sadminuta+" minuta, i "+sadsekundi+" sekundi.");
	}

}
