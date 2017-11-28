package ZADACA_27_11_2017;



public class zadatak3 {

	public static void main(String[] args) {

		long[]mojniz=new long [100];
		
		long []fibonacijev=fibonaci(mojniz);
		
		
		for (int i=0;i<100;i++){
			System.out.println(fibonacijev[i]+" ");
		}
		
		
		}
		
		
		
	

	
	public static long[] fibonaci(long []niz){
		
		niz[0]=0;
		niz[1]=1;
		
		for (int i=2;i<=niz.length-1; i++){
			niz[i]=niz[i-1]+niz[i-2];
			
			
		}
		return niz;
		
	}
}
