package ZADACA_16_11_2017;


import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
		System.out.println(" Kolko æemo pitanja maniènih pitanja postavit??? :D ");
		int broj=unos.nextInt();
		
		pitanja(broj);
		
		unos.close();
	}

	
	public static void pitanja(int n){
		Scanner unos=new Scanner(System.in);
		
		int tacni=0;
		int netacni=0;
		int rezultat=0;
		
		for (int i=1; i<=n; i++){
			
			int broj1=(int) (Math.random()*10+1);
			int broj2=(int) (Math.random()*10+1);
			
			if (broj1>broj2){
		System.out.println("Kolko je "+broj1+"-"+broj2+"???");
			rezultat=broj1-broj2;}
			else if (broj2>broj1){
		System.out.println("Kolko je "+broj2+"-"+broj1+"???");
			rezultat=broj2-broj1;}
			int odgovor=unos.nextInt();
			
			if (odgovor==rezultat){
				tacni++;}
			else
				netacni++;
			}
			
		System.out.println("Od "+n+" pitanja, na "+tacni+" si odgovorio taèno, a na "+netacni+" netaèno..");
			
		unos.close();

}

		
}
	
