package ZADACI_14_11_2017;

public class zadatak1 {

	public static void main(String[] args) {
		
		slovcarandom();
		brojcirandom();
		
	}
	
	public static void brojcirandom(){
		int broj=0;
		
		for (int i=1; i<=100;i++){
			broj=(int) (Math.random()*10);
			if (i%10==0){
			System.out.println(broj);}
			else
			System.out.print(broj + " ");
			
			
		}
	}
	
	
	public static void slovcarandom(){
		
		for (int i=1; i<=100; i++){
			int broj=(int)(Math.random()*25+65);
			char slovo=(char) broj;
			if (i%10==0){
				System.out.println(slovo);}
			else
				System.out.print(slovo+ " ");
			}
			
			
		}
	}


