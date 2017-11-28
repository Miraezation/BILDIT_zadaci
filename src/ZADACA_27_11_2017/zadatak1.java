package ZADACA_27_11_2017;

public class zadatak1 {

	public static void main(String[] args) {

		int[]brojevi={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		System.out.println("Brojevi na neparnim indexima su: (mada metoda ne vraæa niz :< ) ");
		neparan(brojevi);
	
		int[]neparni=neparanniz(brojevi);
		
		System.out.println("");
		
		System.out.println("Ev vako, i da vraæa niz:");
		for (int i=0;i<neparni.length;i++){
			if (neparni[i]>0)
			System.out.print(neparni[i]+" ");
		}
	}
	
		
		
	
		
	
	
	public static void neparan(int [] niz){
		
		for (int i=niz[1];i<=niz.length;i=i+2){
			System.out.print(i+" ");
		}
		
	}
	
	public static int[] neparanniz(int [] niz){
		
		int[] noviniz=new int[niz.length];
		
		
		for (int i=1, j=0;i<=niz.length-1;i=i+2,j++){
			noviniz[j]=niz[i];
		}
		return noviniz;
	}
}	
	